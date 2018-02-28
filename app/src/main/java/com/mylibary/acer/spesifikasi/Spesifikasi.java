package com.mylibary.acer.spesifikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Spesifikasi extends AppCompatActivity {
    ImageView imgSpek;
    TextView Spesifikasi;
    int teksSpesifikasi, posisi;
    String namaItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi);

        imgSpek=(ImageView)findViewById(R.id.imageView);
        Spesifikasi=(TextView)findViewById(R.id.textView);
        AdapterSpek adapterSpek = new AdapterSpek(this);

        Intent i = getIntent();
        posisi = i.getIntExtra("posisi",0);

        switch (posisi){
            case  0: namaItem = "Oppo F5";teksSpesifikasi = R.string.f5;break;
            case  1: namaItem = "Iphone X"; teksSpesifikasi = R.string.ipx;break;
            case  2: namaItem = "Xiaomi mi6";teksSpesifikasi = R.string.mi6;break;
            case  3: namaItem = "Nokia 8";teksSpesifikasi = R.string.n8;break;
            case  4: namaItem = "Samsung S8";teksSpesifikasi = R.string.s8;break;
            case  5: namaItem = "Vivo V7+";teksSpesifikasi = R.string.v7;break;
            case  6: namaItem = "Alienware 17 R4 AW17R4";teksSpesifikasi = R.string.alien;break;
            case  7: namaItem = "ASUS ROG ZEPHYRUS (GX501)";teksSpesifikasi = R.string.rog;break;
            case  8: namaItem = "Asus ROG Strix GL502VT+";teksSpesifikasi = R.string.rogstrix;break;
            case  9: namaItem = "RAZER Blade 14 Gaming RZ09-7700HQ";teksSpesifikasi = R.string.razer;break;
            case 10: namaItem = "Origin EVO 15-S";teksSpesifikasi = R.string.origin;break;
            case 11: namaItem = "Lenovo Yoga 520";teksSpesifikasi = R.string.yoga;break;

        }
        getSupportActionBar().setTitle(namaItem);
        imgSpek.setImageResource(adapterSpek.spesifikasi[posisi]);
        Spesifikasi.setText(teksSpesifikasi);

    }
}
