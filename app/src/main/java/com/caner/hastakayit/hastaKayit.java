package com.caner.hastakayit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hastaKayit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasta_kayit);
    }

    public void cikisy(View v)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    public void geri(View v)
    {
        Intent intent=new Intent(hastaKayit.this, girisSayfa.class);
        startActivity(intent);
    }
}