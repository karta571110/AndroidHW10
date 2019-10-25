package com.example.androidhw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Bpage extends AppCompatActivity {
    int ApageChoise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpage);

        int ApageChoose;
        Intent Adata=getIntent();
        ApageChoose=Adata.getIntExtra("month",0);

    }
}
