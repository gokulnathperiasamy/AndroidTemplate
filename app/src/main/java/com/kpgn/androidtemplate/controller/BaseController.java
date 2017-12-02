package com.kpgn.androidtemplate.controller;

import com.kpgn.androidtemplate.manager.OttoBusManager;
import com.squareup.otto.Bus;

import retrofit2.Retrofit;


public class BaseController {

    protected Bus bus = OttoBusManager.getInstance();
    protected Retrofit retrofit;

}