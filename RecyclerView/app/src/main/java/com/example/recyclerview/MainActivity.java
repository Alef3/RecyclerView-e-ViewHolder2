package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutmanager;

    String[] programNameList = {"Objeto 1", "Objeto 2", "Objeto 3", "Objeto 4", "Objeto 5", "Objeto 6",
            "Objeto 7", "Objeto 8", "Objeto 9", "Objeto 10", "Objeto 11", "Objeto 12", "Objeto 13", "Objeto 14"};

    String[] programDescriptionList = {"Exemplo 1", "Exemplo 2","Exemplo 3", "Exemplo 4","Exemplo 5", "Exemplo 6",
            "Exemplo 7", "Exemplo 8","Exemplo 9", "Exemplo 10","Exemplo 11", "Exemplo 12","Exemplo 13", "Exemplo 14"};

    //int[] programImages = {R.drawable.icon1, R.drawable.icon2, R.drawable.icon3, R.drawable.icon4, R.drawable.icon5,
    //        R.drawable.icon6, R.drawable.icon7, R.drawable.icon8, R.drawable.icon9, R.drawable.icon10, R.drawable.icon11,
    //        R.drawable.icon12, R.drawable.icon13, R.drawable.icon14};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvProgram);
        recyclerView.setHasFixedSize(true);
        layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        programAdapter = new ProgramAdapter(this, programNameList, programDescriptionList);
        recyclerView.setAdapter(programAdapter);
    }
}