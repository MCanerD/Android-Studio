package com.caner.hastakayit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class girisSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris_sayfa);
    }
    public void kayitGecis(View v)
    {
        Intent intent=new Intent(girisSayfa.this, hastaKayit.class);
        startActivity(intent);
    }
    public void kayitliHastaGecis(View v)
    {
        Intent intent=new Intent(girisSayfa.this, kayitliHasta.class);
        startActivity(intent);
    }
    public void hakkindaGecis(View v)
    {
        Intent intent=new Intent(girisSayfa.this, hakkindaSayfa.class);
        startActivity(intent);
    }
    public void cikisx(View v)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}