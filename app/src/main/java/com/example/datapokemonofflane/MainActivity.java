package com.example.datapokemonofflane;

import android.media.DrmInitData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPokemon;

    PokemonController pokemonController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPokemon = findViewById(R.id.rv_pokemon);
        pokemonController = new PokemonController(this);

        pokemonController.InitData();
    }

    public void showRecyclerList(){
        rvPokemon.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(this, pokemonController.getMypokemon());
        rvPokemon.setAdapter(listAdapter);
    }
}
