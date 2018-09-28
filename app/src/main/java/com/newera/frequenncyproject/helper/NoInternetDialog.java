package com.newera.frequenncyproject.helper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.newera.frequenncyproject.R;

public class NoInternetDialog extends AlertDialog {
    private TextView setting, exit;
    private Activity activity;
    private ImageView imageView;

    public NoInternetDialog(Context context, Activity activity) {
        super(context);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_internet_dilalog);
        setting = findViewById(R.id.setting);

        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        dismiss();
                                    }
                                }
        );
        setting.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           activity.startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
                                       }
                                   }
        );
    }
}

