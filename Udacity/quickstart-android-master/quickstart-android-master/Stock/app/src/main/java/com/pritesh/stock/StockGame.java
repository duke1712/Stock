package com.pritesh.stock;

import com.google.firebase.FirebaseApp;

/**
 * Created by Pritesh on 9/3/2016.
 */
public class StockGame extends android.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.getInstance();
    }
}
