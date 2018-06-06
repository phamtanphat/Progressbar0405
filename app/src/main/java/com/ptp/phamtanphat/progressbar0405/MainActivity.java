package com.ptp.phamtanphat.progressbar0405;

import android.os.Handler;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (progressBar.getProgress() >= progressBar.getMax()){
                    handler.removeCallbacks(this);
                }else{
                    progressBar.setProgress(progressBar.getProgress() + 10);
                    handler.postDelayed(this,1000);
                }
            }
        },1000);
    }
}
