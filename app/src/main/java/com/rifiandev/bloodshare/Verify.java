package com.rifiandev.bloodshare;

/*
Tanggal Pengerjaan : Rabu, 28 April 2021
NIM : 10118013
Nama : Rifian Joe Premilenio
Kelas : IF-01
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void pindahHome(View view) {
        Button btn_send = (Button) findViewById(R.id.btnVerifySend);
        String verify = btn_send.getText().toString();
        Log.d("Main", "Nama : " + verify);
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}