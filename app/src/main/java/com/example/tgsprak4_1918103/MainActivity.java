package com.example.tgsprak4_1918103;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Brahim Diaz", "1918103", "2019",R.drawable.diaz));
        mahasiswaArrayList.add(new Mahasiswa("Ibrahimovic", "1918103", "2019",R.drawable.movic));
        mahasiswaArrayList.add(new Mahasiswa("Tonali", "1918031", "2019",R.drawable.tonali));
    }
}

