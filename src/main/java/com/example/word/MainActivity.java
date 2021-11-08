package com.example.word;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"MainActivity==onCreate");


    }

    public void sB(View view) {


        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        startActivity(intent);


    }
    @Override

    protected void onStart()

    {

        // TODO Auto-generated method stub

        super.onStart();

        Log.i(TAG, "MainActivity==onStart");

    }
    @Override

    protected void onRestart()

    {

        // TODO Auto-generated method stub

        super.onRestart();

        Log.i(TAG, "MainActivity==onRestart");

    }
    @Override

    protected void onResume()

    {

        // TODO Auto-generated method stub

        super.onResume();

        Log.i(TAG, "MainActivity==onResume");

    }
    @Override

    protected void onPause()

    {

        // TODO Auto-generated method stub

        super.onPause();

        Log.i(TAG, "MainActivity==onPause");

    }
    @Override

    protected void onStop()

    {

        // TODO Auto-generated method stub

        super.onStop();

        Log.i(TAG, "MainActivity==onStop");

    }
    @Override

    protected void onDestroy()

    {

        // TODO Auto-generated method stub

        super.onDestroy();

        Log.i(TAG, "MainActivity==onDestroy");

    }
}



