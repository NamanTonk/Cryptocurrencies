package com.newera.frequenncyproject.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.newera.frequenncyproject.R;
import com.newera.frequenncyproject.activity.DetailsActivity;
import com.newera.frequenncyproject.interfacs.OnCLick;
import com.newera.frequenncyproject.model.Model;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Viewholder> {
    private List<Model.DataBean> dataBeans;
    private OnCLick onCLick;

    public RecyclerAdapter(List<Model.DataBean> dataBeans) {
        this.dataBeans = dataBeans;
    }

    public void OnClickListner(OnCLick onCLick) {
        this.onCLick = onCLick;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Viewholder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main_item, viewGroup, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int i) {
int RedColor = viewholder.itemView.getResources().getColor(R.color.low);
int GreenColor = viewholder.itemView.getResources().getColor(R.color.high);
        Glide.with(viewholder.itemView.getContext()).load("https://s2.coinmarketcap.com/static/img/coins/64x64/" + dataBeans.get(viewholder.getLayoutPosition()).getId() + ".png").into(viewholder.imageView);
        viewholder.name.setText(dataBeans.get(viewholder.getLayoutPosition()).getName() + " (" + dataBeans.get(viewholder.getLayoutPosition()).getSymbol() + ")");
        viewholder.inr.setText(String.valueOf(dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPrice()) + " (INR) \n" + dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getUSD().getPrice() + " (USD)");
        //viewholder.usd.setText(String.valueOf(dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getUSD().getPrice() + " (USD)"));
        viewholder.renk.setText(dataBeans.get(viewholder.getLayoutPosition()).getRank() + "");
        if (dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_1h() >= 0) {
            viewholder.percentage1h.setTextColor(GreenColor);
            viewholder.percentage1h.setText(dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_1h() + "%");

        } else {
            viewholder.percentage1h.setTextColor(RedColor);
            viewholder.percentage1h.setText(dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_1h() + "%");

        }
        if (dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_24h()>=0){
            viewholder.percentage24h.setTextColor(GreenColor);
            viewholder.percentage24h.setText(dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_24h() + "%");

        }else {
            viewholder.percentage24h.setTextColor(RedColor);
            viewholder.percentage24h.setText(dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_24h() + "%");

        }
        if (dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_7d()>=0){
            viewholder.percentage7d.setTextColor(GreenColor);
            viewholder.percentage7d.setText(dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_7d() + "%");
        }else {
            viewholder.percentage7d.setTextColor(RedColor);
            viewholder.percentage7d.setText(dataBeans.get(viewholder.getLayoutPosition()).getQuotes().getINR().getPercent_change_7d() + "%");
        }

    }

    @Override
    public int getItemCount() {
        return dataBeans.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView name, inr, usd, renk, percentage1h, percentage24h, percentage7d;
        private ImageView imageView;

        public Viewholder(@NonNull final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            inr = itemView.findViewById(R.id.inr);
            renk = itemView.findViewById(R.id.rank);
            percentage1h = itemView.findViewById(R.id.inr_persentage_1h);
            percentage24h = itemView.findViewById(R.id.inr_persentage_24h);
            percentage7d = itemView.findViewById(R.id.inr_persentage_7d);
            //    usd = itemView.findViewById(R.id.usd);
            imageView = itemView.findViewById(R.id.symbol_icon);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), DetailsActivity.class);
                    intent.putExtra("ide", dataBeans.get(getLayoutPosition()).getId() + "");
                    intent.putExtra("name", dataBeans.get(getLayoutPosition()).getName());
                    intent.putExtra("symbol", dataBeans.get(getLayoutPosition()).getSymbol());
                    intent.putExtra("webside_slug", dataBeans.get(getLayoutPosition()).getWebsite_slug() + "");
                    intent.putExtra("rank", dataBeans.get(getLayoutPosition()).getRank() + "");
                    intent.putExtra("circulating_supply", dataBeans.get(getLayoutPosition()).getCirculating_supply() + "");
                    intent.putExtra("total_supply", dataBeans.get(getLayoutPosition()).getTotal_supply() + "");
                    intent.putExtra("max_Supply", dataBeans.get(getLayoutPosition()).getMax_supply() + "");
                    intent.putExtra("inr_price", dataBeans.get(getLayoutPosition()).getQuotes().getINR().getPrice() + "");
                    intent.putExtra("inr_vol", dataBeans.get(getLayoutPosition()).getQuotes().getINR().getVolume_24h() + "");
                    intent.putExtra("inr_cap", dataBeans.get(getLayoutPosition()).getQuotes().getINR().getMarket_cap() + "");
                    intent.putExtra("inr_1h", dataBeans.get(getLayoutPosition()).getQuotes().getINR().getPercent_change_1h() + "");
                    intent.putExtra("inr_7d", dataBeans.get(getLayoutPosition()).getQuotes().getINR().getPercent_change_7d() + "");
                    intent.putExtra("inr_24h", dataBeans.get(getLayoutPosition()).getQuotes().getINR().getPercent_change_24h() + "");
                    intent.putExtra("inr_cap", dataBeans.get(getLayoutPosition()).getQuotes().getINR().getMarket_cap() + "");
                    intent.putExtra("usd_price", dataBeans.get(getLayoutPosition()).getQuotes().getUSD().getPrice() + "");
                    intent.putExtra("usd_vol", dataBeans.get(getLayoutPosition()).getQuotes().getUSD().getVolume_24h() + "");
                    intent.putExtra("usd_market", dataBeans.get(getLayoutPosition()).getQuotes().getUSD().getMarket_cap() + "");
                    intent.putExtra("usd_1h", dataBeans.get(getLayoutPosition()).getQuotes().getUSD().getPercent_change_1h() + "");
                    intent.putExtra("usd_24h", dataBeans.get(getLayoutPosition()).getQuotes().getUSD().getPercent_change_24h() + "");
                    intent.putExtra("usd_7d", dataBeans.get(getLayoutPosition()).getQuotes().getUSD().getPercent_change_7d() + "");
                    itemView.getContext().startActivity(intent);

                }
            });

        }
    }
}
