package com.example.marco.training;

import android.app.Application;
import android.util.Log;

/**
 * Created by Marco on 04.10.2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("Application","onCreate");
    }


}
