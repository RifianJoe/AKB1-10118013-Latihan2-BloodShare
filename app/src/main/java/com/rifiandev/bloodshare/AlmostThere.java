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

public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }

    public void pindahVerify(View view){
        Button btn_almost = (Button) findViewById(R.id.btnButtonVerify);
        String almost = btn_almost.getText().toString();
        Log.d("Main", "Nama : "+almost);
        Intent intent = new Intent (this, Verify.class);
        startActivity(intent);
    }
}