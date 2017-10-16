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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);

        progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar.setMax(10);
        progressBar.setProgress(5);
        progressBar.setSecondaryProgress(6);
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
                break;
            case R.id.button2:
                progressBar.setProgress(8);
                progressBar.setSecondaryProgress(10);
                break;
            case R.id.button3:
                progressBar.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }




    }
}
