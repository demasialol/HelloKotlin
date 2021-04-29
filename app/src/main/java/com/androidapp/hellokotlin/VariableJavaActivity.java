package com.androidapp.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    TextView txtActivityStartTime, txtCountBtnClicks, txtElapsedTime;
    Button btnClickMe;
    int clcikCount;
    long elapsedSeconds;
    long startTime= System.currentTimeMillis();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCountBtnClicks = findViewById(R.id.txtCountBtnClicks);
        txtElapsedTime = findViewById(R.id.txtElapsedTime);
        btnClickMe = findViewById(R.id.btnClickMe);

        clcikCount=0;
        long elapsedSeconds=0;
        long startTime= System.currentTimeMillis();


        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long elapsedSeconds = (long) ((System.currentTimeMillis()-startTime)/1000.0);
                clcikCount++;
                txtCountBtnClicks.setText("Button clicks = " +clcikCount);
                txtElapsedTime.setText("Elapsed Seconds =" + elapsedSeconds);

            }
        });
        String sTimeStamp = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + sTimeStamp);

    }
}