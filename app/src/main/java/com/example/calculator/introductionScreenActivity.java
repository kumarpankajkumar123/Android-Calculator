package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class introductionScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_screen);

        getSupportActionBar().hide();
        
        Thread thread = new Thread(){

            public  void run(){
                try{
                 sleep(1000);
                }
                catch (Exception e){

                    e.printStackTrace();
                }
                finally {

                    Intent intent = new Intent(introductionScreenActivity.this , MainActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }
}