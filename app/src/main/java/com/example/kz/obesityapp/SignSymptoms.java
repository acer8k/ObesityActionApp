package com.example.kz.obesityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by dark_ on 11/9/2015.
 */
public class SignSymptoms extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signsymptopm_screen);

        ImageButton bt2home = (ImageButton) findViewById(R.id.btn_1);
        bt2home.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           // TODO Auto-generated method stub
                                           startActivity(new Intent("android.intent.action.hm_screen"));
                                       }
                                   }
        );


        //////////
        ImageButton bt2prevention = (ImageButton) findViewById(R.id.btn_2);
        bt2prevention.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 // TODO Auto-generated method stub
                                                 startActivity(new Intent("android.intent.action.Prevention"));
                                             }
                                         }
        );
    }
}

//////////



/*

public class PreventPU extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_prevent);
    }

}

 */