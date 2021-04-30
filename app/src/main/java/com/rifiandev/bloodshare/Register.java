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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner bloodType = (Spinner) findViewById(R.id.bloodType);
        ArrayAdapter<String> blood_Type;
        blood_Type = new ArrayAdapter<String>(Register.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.bloodType));
        blood_Type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bloodType.setAdapter(blood_Type);

        Spinner rhesus = (Spinner) findViewById(R.id.rhesus);
        ArrayAdapter<String> rhesuss;
        rhesuss = new ArrayAdapter<String>(Register.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.rhesus));
        rhesuss.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rhesus.setAdapter(rhesuss);

        Spinner job = (Spinner) findViewById(R.id.spinnerJob);
        ArrayAdapter<String> jobb = new ArrayAdapter<String>(Register.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.job));
        jobb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        job.setAdapter(jobb);
    }

    public void pindahAlmost(View view){
        Button btn_register = (Button) findViewById(R.id.btnRegister);
        String register = btn_register.getText().toString();
        Log.d("Main", "Nama : "+register);
        Intent intent = new Intent (this, AlmostThere.class);
        startActivity(intent);
    }
}