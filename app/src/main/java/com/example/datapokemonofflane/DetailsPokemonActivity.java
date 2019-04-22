package com.example.datapokemonofflane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsPokemonActivity extends AppCompatActivity {

    ImageView imgDetailsPokemon;
    TextView tvDetailsRarity;
    TextView tvNamaPokemon;
    TextView tvDetailsDeck;

    PokemonModel pokemonModel;

    public static final String EXTRA_POKEMON = "extra_pokemon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pokemon);

        tvNamaPokemon = findViewById(R.id.tv_nama_details_pokemon);
        tvDetailsRarity = findViewById(R.id.tv_details_rarity_pokemon);
        tvDetailsDeck = findViewById(R.id.tv_details_deck_pokemon);
        imgDetailsPokemon = findViewById(R.id.img_details_pokemon);

        pokemonModel = (PokemonModel) getIntent().getParcelableExtra(EXTRA_POKEMON);

        tvNamaPokemon.setText(pokemonModel.getName());
        tvDetailsRarity.setText(pokemonModel.getRarity());
        tvDetailsDeck.setText(pokemonModel.getSet());
        Glide.with(this)
                .load(pokemonModel.getImage())
                .placeholder(R.mipmap.ic_launcher_round)
                .into(imgDetailsPokemon);
    }

}
