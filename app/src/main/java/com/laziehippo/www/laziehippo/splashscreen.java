package com.laziehippo.www.laziehippo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
    Thread mythread=new Thread(){
        @Override
        public void run() {
            try {
                sleep(3000);
                Intent intent=new Intent(getApplicationContext(),loginActivity.class);
                startActivity(intent);
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
        mythread.start();
    }
}
