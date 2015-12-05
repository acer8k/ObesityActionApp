package com.example.kz.obesityapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by dark_ on 12/4/2015.
 */
public class hm_screen2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen_2);

        // OVERVIEW SCREEN STARTS
        ImageButton btn_h2overview = (ImageButton) findViewById(R.id.imageButton2);
        btn_h2overview.setOnClickListener(new View.OnClickListener() {

                                              @Override
                                              public void onClick(View v) {
                                                  // TODO Auto-generated method stub
                                                  startActivity(new Intent("android.intent.action.OverView"));
                                              }
                                          }
        );
        // OVERVIEW SCREEN ENDS

        // RISK SCREEN STARTS
        ImageButton btn_h2risk = (ImageButton) findViewById(R.id.imageButton3);
        btn_h2risk.setOnClickListener(new View.OnClickListener() {

           @Override
          public void onClick(View v) {
          // TODO Auto-generated method stub
           startActivity(new Intent("android.intent.action.AreYouAtRisk"));
              }
                      }
        );
        // RISK SCREEN ENDS

        // SignSymptoms SCREEN STARTS
        ImageButton btn_h2sign = (ImageButton) findViewById(R.id.imageButton4);
        btn_h2sign.setOnClickListener(new View.OnClickListener() {

         @Override
          public void onClick(View v) {
              // TODO Auto-generated method stub
           startActivity(new Intent("android.intent.action.SignSymptoms"));
            }
           }
        );
        // SignSymptoms SCREEN ENDS

        // Prevention SCREEN STARTS
        ImageButton btn_h2prevention = (ImageButton) findViewById(R.id.imageButton5);
        btn_h2prevention.setOnClickListener(new View.OnClickListener() {

        @Override
          public void onClick(View v) {
           // TODO Auto-generated method stub
           startActivity(new Intent("android.intent.action.Prevention"));
             }
             }
        );
        // Prevention SCREEN ENDS

        // Prevention SCREEN STARTS
        ImageButton btn_h2tipsEx = (ImageButton) findViewById(R.id.imageButton6);
        btn_h2tipsEx.setOnClickListener(new View.OnClickListener() {

        @Override
      public void onClick(View v) {
         // TODO Auto-generated method stub
           startActivity(new Intent("android.intent.action.Tips"));
            }
            }
        );
        // Prevention SCREEN ENDS




    }
}


/*
public class ContactPU extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_contact);

        Button xml_askfeed = (Button) findViewById(R.id.btnAsk);
        xml_askfeed.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
      // TODO Auto-generated method stub
      startActivity(new Intent("android.intent.action.AskFeedPU"));
      }
     }
        );
    }
 */