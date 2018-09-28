package com.newera.frequenncyproject.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.newera.frequenncyproject.R;


public class DetailsActivity extends Activity {
    private Intent intent;
    private TextView rank, name, inr_price, cir_supply, total_supply, max_supply, supply, inr_vol, inr_markitCap;
    private TextView inr_percentage1h, inr_percentage24h, inr_percentage7d, inrdetails, usddetails;
    private TextView usd_percentage1h, usd_percentage24h, usd_percentage7d, usd_price, usd_vol, usd_markit;
    private ImageView icon;
    private ImageView one_arrow, two_arrow, three_arrow, four_arrow, five_arrow, six_arrow;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        intent = getIntent();
        supply = findViewById(R.id.title_supply);
        rank = findViewById(R.id.rank_details);
        cir_supply = findViewById(R.id.circulating_details);
        total_supply = findViewById(R.id.total_supply);
        max_supply = findViewById(R.id.max_details);
        name = findViewById(R.id.name_details);
        inr_price = findViewById(R.id.inr_price_details);
        inr_markitCap = findViewById(R.id.inr_markit_details);
        inr_vol = findViewById(R.id.inr_volume_details);
        usd_price = findViewById(R.id.usd_price_details);
        usd_vol = findViewById(R.id.usd_volume_details);
        usd_markit = findViewById(R.id.usd_markit_details);
        usd_percentage1h = findViewById(R.id.usd_persentage1h_details);
        usd_percentage24h = findViewById(R.id.usd_persentage24h_details);
        usd_percentage7d = findViewById(R.id.usd_persentage7d_details);
        icon = findViewById(R.id.icon_details);
        inrdetails = findViewById(R.id.inr_details);
        usddetails = findViewById(R.id.usd_details);
        inr_percentage1h = findViewById(R.id.inr_persentage1h_details);
        inr_percentage24h = findViewById(R.id.inr_persentage24h_details);
        inr_percentage7d = findViewById(R.id.inr_persentage7d_details);
        one_arrow = findViewById(R.id.one_arrow);
        two_arrow = findViewById(R.id.two_arrow);
        three_arrow = findViewById(R.id.three_arrow);
        four_arrow = findViewById(R.id.four_arrow);
        five_arrow = findViewById(R.id.five_arrow);
        six_arrow = findViewById(R.id.six_arrow);
        supply.setText(intent.getStringExtra("name") + " Supply");
        rank.setText(intent.getStringExtra("rank"));
        name.setText(intent.getStringExtra("name") + " (" + intent.getStringExtra("symbol") + ")");
        inr_price.setText(intent.getStringExtra("inr_price"));
        inr_vol.setText(intent.getStringExtra("inr_vol"));
        inr_markitCap.setText(intent.getStringExtra("inr_cap"));
        usd_price.setText(intent.getStringExtra("usd_price"));
        usd_vol.setText(intent.getStringExtra("usd_vol"));
        usd_markit.setText(intent.getStringExtra("usd_market"));
        usd_percentage1h.setText(intent.getStringExtra("usd_1h"));
        usd_percentage24h.setText(intent.getStringExtra("usd_24h"));
        usd_percentage7d.setText(intent.getStringExtra("usd_7d"));
        cir_supply.setText(intent.getStringExtra("circulating_supply"));
        total_supply.setText(intent.getStringExtra("total_supply"));
        max_supply.setText(intent.getStringExtra("max_Supply"));
        inr_percentage1h.setText(intent.getStringExtra("inr_1h"));
        inr_percentage24h.setText(intent.getStringExtra("inr_24h"));
        inr_percentage7d.setText(intent.getStringExtra("inr_7d"));
        inrdetails.setText(intent.getStringExtra("name") + " INR");
        usddetails.setText(intent.getStringExtra("name") + " USD");
        Glide.with(this).load("https://s2.coinmarketcap.com/static/img/coins/64x64/" + intent.getStringExtra("ide") + ".png").into(icon);
        Double.valueOf(intent.getStringExtra("inr_1h"));
        if (CheckValue(Double.valueOf(intent.getStringExtra("inr_1h")))) {
            Glide.with(this).load(R.drawable.ic_line_chart).into(one_arrow);

        } else {
            Glide.with(this).load(R.drawable.ic_loss).into(one_arrow);

        }
        if (CheckValue(Double.valueOf(intent.getStringExtra("inr_7d")))) {
            Glide.with(this).load(R.drawable.ic_line_chart).into(three_arrow);

        } else {
            Glide.with(this).load(R.drawable.ic_loss).into(three_arrow);

        }
        if (CheckValue(Double.valueOf(intent.getStringExtra("inr_24h")))) {
            Glide.with(this).load(R.drawable.ic_line_chart).into(two_arrow);

        } else {
            Glide.with(this).load(R.drawable.ic_loss).into(two_arrow);

        }
        if (CheckValue(Double.valueOf(intent.getStringExtra("usd_1h")))) {
            Glide.with(this).load(R.drawable.ic_line_chart).into(four_arrow);

        } else {
            Glide.with(this).load(R.drawable.ic_loss).into(four_arrow);

        }
        if (CheckValue(Double.valueOf(intent.getStringExtra("usd_24h")))) {
            Glide.with(this).load(R.drawable.ic_line_chart).into(five_arrow);

        } else {
            Glide.with(this).load(R.drawable.ic_loss).into(five_arrow);

        }
        if (CheckValue(Double.valueOf(intent.getStringExtra("usd_7d")))) {
            Glide.with(this).load(R.drawable.ic_line_chart).into(six_arrow);

        } else {
            Glide.with(this).load(R.drawable.ic_loss).into(six_arrow);

        }

    }

    public boolean CheckValue(Double d) {
        if (d >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
