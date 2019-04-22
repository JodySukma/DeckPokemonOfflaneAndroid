package com.example.datapokemonofflane;

import java.util.ArrayList;

public class PokemonController {
    private MainActivity pokemonView;

    private ArrayList<PokemonModel> mypokemon = new ArrayList<>();

    public ArrayList<PokemonModel> getMypokemon() {
        return mypokemon;
    }

    public PokemonController(MainActivity pokemonView) {
        this.pokemonView = pokemonView;
    }

    public void InitData(){
        mypokemon.addAll(DataPokemon.getPokeData());
        pokemonView.showRecyclerList();
    }
}
