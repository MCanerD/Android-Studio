package com.caner.hastakayit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hakkindaSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hakkinda_sayfa);
    }

    public void donusx(View v)
    {
        Intent intent=new Intent(hakkindaSayfa.this, girisSayfa.class);
        startActivity(intent);
    }
    public void cikisxx(View v)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

}