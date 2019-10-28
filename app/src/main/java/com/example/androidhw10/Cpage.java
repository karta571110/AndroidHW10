package com.example.androidhw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cpage extends AppCompatActivity {
     int month;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpage);

        String reuslt;

        TextView reulttext=(TextView)findViewById(R.id.resulttext);
        Button CtoBbtn=(Button)findViewById(R.id.CtoBbtn);
        final Button CtoAbtn=(Button)findViewById(R.id.CtoAbtn);

        final Intent bonus=getIntent();
        reuslt=bonus.getStringExtra("getprize");

        reulttext.setText(""+reuslt);

        CtoBbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                month=bonus.getIntExtra("month",0);
                Intent CtB=new Intent(Cpage.this,Bpage.class);
                CtB.putExtra("month",month);
                startActivity(CtB);
            }
        });
        CtoAbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CtA=new Intent(Cpage.this,MainActivity.class);
                startActivity(CtA);
            }
        });
    }
}
