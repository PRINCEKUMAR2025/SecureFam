package com.example.securefam;

import static com.example.securefam.ApplicationClass1.API_KEY;
import static com.example.securefam.ApplicationClass1.APPLICATION_ID;
import static com.example.securefam.ApplicationClass1.SERVER_URL;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass2 extends Application {

    public static final String APPLICATION_ID = "B8300527-C38E-4B0B-FFA1-ABFE1592BF00";
    public static final String API_KEY = "5AAEC2C0-0D17-417B-B61E-09094E37AD9A";
    public static final String SERVER_URL = "https://api.backendless.com";
    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );

    }
}
