package com.example.kz.obesityapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by dark_ on 9/13/2015.
 *
 * // This is the homescreen
 */
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