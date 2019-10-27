package com.example.androidhw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
               sendtob(1);
            }
        });
        threefourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtob(3);
            }
        });
        fivesixbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtob(5);
            }
        });
        seveneightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtob(7);
            }
        });
        ninetenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtob(9);
            }
        });
        eleventwelvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtob(11);
            }
        });

    }
    public  void sendtob(int Month){
        Intent sendatob=new Intent(MainActivity.this,Bpage.class);
        sendatob.putExtra("month",Month);
        startActivity(sendatob);

    }
}
