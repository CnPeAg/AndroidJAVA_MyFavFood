package com.example.myfavfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.myfavfood.adapter.ListFoodAdapter;
import com.example.myfavfood.model.DataMakanan;
import com.example.myfavfood.model.Makanan;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView rvMakanan;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakanan = findViewById(R.id.rv_food);
        rvMakanan.setHasFixedSize(true);

        list.addAll(DataMakanan.getListData());
        makananList();

    }

    private void makananList(){
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvMakanan.setAdapter(listFoodAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profil, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profil:
                Intent i = new Intent(this,activity_profil.class);
                this.startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
