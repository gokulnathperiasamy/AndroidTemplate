package com.kpgn.androidtemplate.manager;

import com.squareup.otto.Bus;


public class OttoBusManager {

    private static Bus bus;

    private OttoBusManager() {

    }

    public static Bus getInstance() {
        if (bus == null) {
            synchronized (OttoBusManager.class) {
                if (bus == null) {
                    bus = new Bus();
                }
            }
        }
        return bus;
    }

}