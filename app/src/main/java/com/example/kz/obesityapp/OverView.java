package com.example.kz.obesityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by dark_ on 10/11/2015.
 */
public class OverView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overview_screen);

    ImageButton bt2home = (ImageButton) findViewById(R.id.btn_1);
    bt2home.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       // TODO Auto-generated method stub
                                       startActivity(new Intent("android.intent.action.hm_screen"));
                                   }
                               }
        );


    ImageButton bt2risk = (ImageButton) findViewById(R.id.btn_2);
    bt2risk.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            startActivity(new Intent("android.intent.action.AreYouAtRisk"));
        }
    }
    );
}



    }






/*
public class hm_screen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        Button btn2overview = (Button) findViewById(R.id.btn_over);
        btn2overview.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
          // TODO Auto-generated method stub
           startActivity(new Intent("android.intent.action.OverView"));
             }
             }
        );
    }
}
 */