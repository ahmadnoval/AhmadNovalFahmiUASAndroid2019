package com.example.nauval.ahmadnovalfahmi_uas_android_2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.ref.ReferenceQueue;

public class getJSON extends AppCompatActivity {

    private TextView kota;
    private TextView siang;
    private TextView malam;
    private TextView dini_hari;
    private TextView suhu;
    private TextView kelembapan;
    private ReferenceQueue aqueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_json);
        kota = findViewById(R.id.kota);
        siang = findViewById(R.id.siang);
        malam = findViewById(R.id.malam);
        dini_hari = findViewById(R.id.dini_hari);
        suhu = findViewById(R.id.suhu);
        kelembapan = findViewById(R.id.kelembapan);

        Button btnJSON = findViewById(R.id.buttonJSON);
        btnJSON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ambilJson();
            }
        });
    }
    private void ambilJson(){
        String url = "https://api.myjson.com/bins/uclpo"

                JsonObjectRequest request = new JsonOb
    }
}
