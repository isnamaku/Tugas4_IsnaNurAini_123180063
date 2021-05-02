package com.example.mymusik;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class Detail extends AppCompatActivity {

    TextView tvJudul, tvArtis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tv_judul);
        tvArtis = findViewById(R.id.tv_artis);
        tvJudul.setText(getIntent().getStringExtra("judul"));
        tvArtis.setText(getIntent().getStringExtra("artis"));

    }
}