package com.mylibary.acer.spesifikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridSpek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridSpek = (GridView) findViewById(R.id.gridspek);
        gridSpek.setAdapter(new AdapterSpek(this));

        gridSpek.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Spesifikasi.class);
                intent.putExtra("posisi", position);
                startActivity(intent);
            }
        });
    }
}
