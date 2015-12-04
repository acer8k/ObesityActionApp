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