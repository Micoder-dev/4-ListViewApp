package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.my_listview);

        String[] my_planets = new String[] {
                "Mercury",
                "Venus",
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptune"
        };

        ArrayList<String> myPlanetsList = new ArrayList<>();
        myPlanetsList.addAll(Arrays.asList(my_planets));

        listAdapter = new ArrayAdapter<String>(this, R.layout.my_row, myPlanetsList);

        listAdapter.add("Ceres");
        listAdapter.add("Pluto");
        listAdapter.add("Haumea");
        listAdapter.add("Makemake");
        listAdapter.add("Eris");

        mListView.setAdapter(listAdapter);

    }
}