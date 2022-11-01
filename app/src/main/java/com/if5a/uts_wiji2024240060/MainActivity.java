package com.if5a.uts_wiji2024240060;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText etNama,etNomorPendaftaran;
    Spinner spJalurPendaftaran;
    CheckBox cbKonfirmasiDaftar;
    Button btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("UTS Wiji");
        etNama = findViewById(R.id.et_nama);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        spJalurPendaftaran = findViewById(R.id.sp_jalur_pendaftaran);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama2 = etNama.getText().toString();
                String NomorDaftar2 = etNomorPendaftaran.getText().toString();
                String Jalur2 = spJalurPendaftaran.getSelectedItem().toString();//untuk kirim ke Layout 2

                //membuat intent
                Intent kirim = new Intent(MainActivity.this, Result_Activity2.class);
                kirim.putExtra("xNamaLengkap",Nama2);
                kirim.putExtra("xNomorDaftar",NomorDaftar2);
                kirim.putExtra("xJalurDaftar",Jalur2);
                startActivity(kirim);
            }
        });

    }
}

