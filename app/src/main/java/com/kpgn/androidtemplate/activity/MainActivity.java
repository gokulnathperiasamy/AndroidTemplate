package com.kpgn.androidtemplate.activity;

import android.os.Bundle;

import com.kpgn.androidtemplate.R;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ButterKnife.bind(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
