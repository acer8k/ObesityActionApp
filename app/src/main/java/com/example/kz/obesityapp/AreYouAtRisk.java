package com.example.kz.obesityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by dark_ on 11/8/2015.
 */
public class AreYouAtRisk extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.risk_screen);

        ImageButton bt2home = (ImageButton) findViewById(R.id.btn_1);
        bt2home.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           // TODO Auto-generated method stub
                                           startActivity(new Intent("android.intent.action.hm_screen"));
                                       }
                                   }
        );


    }

}


/*
public class StagesPU extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_stages);
    }
}

 */