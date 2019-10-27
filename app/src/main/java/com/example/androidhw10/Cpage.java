package com.example.androidhw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Cpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpage);

        String reuslt;
        TextView reulttext=(TextView)findViewById(R.id.resulttext);
        Button CtoBbtn=(Button)findViewById(R.id.CtoBbtn);
        Button CtoAbtn=(Button)findViewById(R.id.CtoAbtn);

        Intent bonus=getIntent();
        reuslt=bonus.getStringExtra("getprize");

        reulttext.setText(""+reuslt);
    }
}
