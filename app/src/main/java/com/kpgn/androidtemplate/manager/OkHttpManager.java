package com.kpgn.androidtemplate.manager;

import android.content.Context;

import okhttp3.OkHttpClient;


public class OkHttpManager {

    private static OkHttpClient okHttpClient;

    private OkHttpManager() {

    }

    public static OkHttpClient getInstance(Context context) {
        if (okHttpClient == null) {
            synchronized (OkHttpManager.class) {
                if (okHttpClient == null) {
                    okHttpClient = new OkHttpClient.Builder().build();
                }
            }
        }
        return okHttpClient;
    }

}