
    package com.phonegap.exampleapp;

    import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

import com.phonegap.*;

    public class exampleapp extends DroidGap
    {
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            super.loadUrl("file:///android_asset/www/index.html");
            

        }
    }
    
