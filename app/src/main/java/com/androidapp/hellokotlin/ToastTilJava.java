package com.androidapp.hellokotlin;

import android.widget.Toast;

public class ToastTilJava {
    //FlowControlJavaActivity onObject = new ... ()
    //anObject.toas_short(message);
    //MainApplication aObj = new MainApplication();
    public static void toast_short(String s){
        Toast.makeText(MainApplication.get_appContext(), s, Toast.LENGTH_SHORT).show();
    }

    public static void toast_long(String s){
        Toast.makeText(MainApplication.get_appContext(), s, Toast.LENGTH_LONG).show();
    }
}
