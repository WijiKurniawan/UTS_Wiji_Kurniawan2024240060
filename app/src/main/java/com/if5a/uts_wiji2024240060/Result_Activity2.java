package com.if5a.uts_wiji2024240060;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result_Activity2 extends AppCompatActivity {
    TextView tampilNama,tampilNomor,tampilJalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        tampilNama = findViewById(R.id.tv_nama);
        tampilNomor = findViewById(R.id.tv_nomor_pendaftaran);
        tampilJalur = findViewById(R.id.tv_jalur_pendaftaran);

        Intent masuk = getIntent();
        String yNamaLengkap = masuk.getStringExtra("xNamaLengkap");
        tampilNama.setText(yNamaLengkap);
        String yNomorDaftar = masuk.getStringExtra("xNomorDaftar");
        tampilNomor.setText(yNomorDaftar);
        String yJalurDaftar = masuk.getStringExtra("xJalurDaftar");
        tampilJalur.setText(yJalurDaftar);
    }
}