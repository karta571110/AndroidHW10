package com.example.androidhw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
int Month;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button onetwobtn = (Button) findViewById(R.id.onetwobtn);
        Button threefourbtn = (Button) findViewById(R.id.threefourbtn);
        Button fivesixbtn = (Button) findViewById(R.id.fivesixbtn);
        Button seveneightbtn = (Button) findViewById(R.id.seveneightbtn);
        Button ninetenbtn = (Button) findViewById(R.id.ninetenbtn);
        Button eleventwelvebtn = (Button) findViewById(R.id.eleventwelvebtn);



        onetwobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Month=1;
               sendtob();
            }
        });
        threefourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Month=3;
                sendtob();
            }
        });
        fivesixbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Month=5;
                sendtob();
            }
        });
        seveneightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Month=7;
                sendtob();
            }
        });
        ninetenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Month=9;
                sendtob();
            }
        });
        eleventwelvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Month=11;
                sendtob();
            }
        });

    }
    public  void sendtob(){
        Intent sendatob=new Intent(MainActivity.this,Bpage.class);
        sendatob.putExtra("month",Month);
        startActivity(sendatob);

    }
}
