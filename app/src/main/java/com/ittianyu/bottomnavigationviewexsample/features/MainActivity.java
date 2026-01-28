package com.ittianyu.bottomnavigationviewexsample.features;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.ittianyu.bottomnavigationviewexsample.R;
import com.ittianyu.bottomnavigationviewexsample.databinding.ActivityMainBinding;
import com.ittianyu.bottomnavigationviewexsample.features.badgeview.BadgeViewActivity;
import com.ittianyu.bottomnavigationviewexsample.features.centerfab.CenterFabActivity;
import com.ittianyu.bottomnavigationviewexsample.features.setupwithviewpager.SetupWithViewPagerActivity;
import com.ittianyu.bottomnavigationviewexsample.features.style.StyleActivity;
import com.ittianyu.bottomnavigationviewexsample.features.viewpager.WithViewPagerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bind = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init();
    }

    private void init() {
        bind.btnStyle.setOnClickListener(this);
        bind.btnWithViewPager.setOnClickListener(this);
        bind.btnSetupWithViewPager.setOnClickListener(this);
        bind.btnBadgeView.setOnClickListener(this);
        bind.btnCenterFab.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, BadgeViewActivity.class));
//        switch (view.getId()) {
//            case 1000001:
//                startActivity(new Intent(this, StyleActivity.class));
//                break;
//            case 1000012:
//                startActivity(new Intent(this, WithViewPagerActivity.class));
//                break;
//            case 1000042:
//                startActivity(new Intent(this, SetupWithViewPagerActivity.class));
//                break;
//            case 1000025:
//                startActivity(new Intent(this, BadgeViewActivity.class));
//                break;
//            case 1000023:
//                startActivity(new Intent(this, CenterFabActivity.class));
//                break;
//
//        }
    }
}
