package com.newera.frequenncyproject.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.EventLogTags;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.newera.frequenncyproject.helper.EndlessScrollListener;
import com.newera.frequenncyproject.helper.NetworkState;
import com.newera.frequenncyproject.helper.NoInternetDialog;
import com.newera.frequenncyproject.interfacs.Calling;
import com.newera.frequenncyproject.R;
import com.newera.frequenncyproject.adapter.RecyclerAdapter;
import com.newera.frequenncyproject.model.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<Model>, NetworkState.NetworkStateReceiverListener {
    private RecyclerView recyclerView;
    private List<Model.DataBean> models = new ArrayList<>();
    private RecyclerAdapter recyclerAdapter;
    private ProgressBar progressBar, progressBar2;
    private int pages = 1;
    private NetworkState networkStateReceiver;
    private NoInternetDialog noInternetDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        progressBar = findViewById(R.id.progressBAr);
        progressBar2 = findViewById(R.id.progressBAr2);
        networkStateReceiver = new NetworkState();
        networkStateReceiver.addListener(this);
        this.registerReceiver(networkStateReceiver, new IntentFilter(android.net.ConnectivityManager.CONNECTIVITY_ACTION));
        noInternetDialog = new NoInternetDialog(this, this);
    }

    public void onDestroy() {
        super.onDestroy();
        networkStateReceiver.removeListener(this);
        this.unregisterReceiver(networkStateReceiver);
    }
    private void CallApi() {
        Calling.api("https://api.coinmarketcap.com").MODEL_CALL(pages * 20, "id").enqueue(this);
    }

    @Override
    public void onResponse(Call<Model> call, Response<Model> response) {
        if (response.body() != null) {
            progressBar.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
            Model mod = response.body();
            models.clear();
            assert mod != null;
            models.addAll(mod.getData());
            recyclerAdapter.notifyDataSetChanged();
            progressBar2.setVisibility(View.GONE);
        }
    }


    @Override
    public void onFailure(Call<Model> call, Throwable t) {
        noInternetDialog = new NoInternetDialog(this, this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(noInternetDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        recyclerView.setVisibility(View.GONE);
        progressBar2.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);
        noInternetDialog.show();


    }

    public void Activitywork() {

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerAdapter = new RecyclerAdapter(models);
        recyclerView.setAdapter(recyclerAdapter);
        CallApi();
        recyclerView.addOnScrollListener(new EndlessScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                progressBar2.setVisibility(View.VISIBLE);
                pages++;
                CallApi();
            }
        });
    }


    @Override
    public void networkAvailable() {
        Activitywork();
        noInternetDialog.dismiss();

    }

    @Override
    public void networkUnavailable() {
        noInternetDialog = new NoInternetDialog(this, this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(noInternetDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        recyclerView.setVisibility(View.GONE);
        progressBar2.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);
        noInternetDialog.show();

    }


}
