package com.caner.hastakayit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kayitliHasta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kayitli_hasta);
    }

    public void cikisz(View v)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    public void donus(View v)
    {
        Intent intent=new Intent(kayitliHasta.this, girisSayfa.class);
        startActivity(intent);
    }
}