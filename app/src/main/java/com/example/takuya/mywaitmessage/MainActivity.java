package com.example.takuya.mywaitmessage;

import android.app.ProgressDialog;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ProgressBar progressBar;
    ProgressBar progressBar2;
    ProgressBar progressBar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar2.setMax(10);
        progressBar2.setProgress(5);
        progressBar2.setSecondaryProgress(6);

        progressBar3 = (ProgressBar) findViewById(R.id.progressBar3);
    }

    /*
       * ボタンクリック時の処理
       */
    @Override
    public void onClick(View v) {
        Log.d("onClick","onClick");

        switch (v.getId()){
            case R.id.button:
                progressBar.setVisibility(View.VISIBLE);
                progressBar2.setVisibility(View.VISIBLE);
                progressBar3.setVisibility(View.VISIBLE);
                break;
            case R.id.button2:
                progressBar2.setProgress(8);
                progressBar2.setSecondaryProgress(10);
                break;
            case R.id.button3:
                progressBar.setVisibility(View.INVISIBLE);
                progressBar2.setVisibility(View.INVISIBLE);
                progressBar3.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }




    }
}
