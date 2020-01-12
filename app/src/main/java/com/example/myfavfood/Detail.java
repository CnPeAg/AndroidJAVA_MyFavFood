package com.example.myfavfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Detail Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getIncomingIntent();
    }

    private void getIncomingIntent(){

        String name = getIntent().getStringExtra("nama");
        String desc = getIntent().getStringExtra("desc");
        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("img");
        set(pic, name, desc);
    }

    private void set(int image, String name, String desc){
        TextView nama = findViewById(R.id.nama_detail);
        nama.setText(name);

        TextView deskripsi = findViewById(R.id.deskripsi);
        deskripsi.setText(desc);

        ImageView img = findViewById(R.id.img_detail);
        img.setImageResource(image);

    }
}
