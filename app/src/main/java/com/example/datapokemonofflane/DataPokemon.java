package com.example.datapokemonofflane;

import com.example.datapokemonofflane.PokemonModel;

import java.util.ArrayList;

public class DataPokemon {

    public static String[][] data = new String[][]{
            {
                    "Cubone",
                    "https://images.pokemontcg.io/dp6/90.png",
                    "Common",
                    "Legends Awakened"
            },
            {
                    "Windstorm",
                    "https://images.pokemontcg.io/ex14/85.png",
                    "Uncommon",
                    "Crystal Guardians"
            },
            {
                    "Turtwig",
                    "https://images.pokemontcg.io/pop9/17.png",
                    "Common",
                    "POP Series 9"
            },
            {
                    "Bellossom",
                    "https://images.pokemontcg.io/xy7/4.png",
                    "Uncommon",
                    "Ancient Origins"
            },
            {
                    "Hariyama ex",
                    "https://images.pokemontcg.io/ex8/100.png",
                    "Rare Holo EX",
                    "Deoxys"
            },
            {
                    "Deoxys",
                    "https://images.pokemontcg.io/xyp/XY05.png",
                    "Rare",
                    "XY Black Star Promos"
            },
            {
                    "Aggron",
                    "https://images.pokemontcg.io/ex16/1.png",
                    "Rare Holo",
                    "Power Keepers"
            },
            {
                    "Misdreavus",
                    "https://images.pokemontcg.io/dp6/107.png",
                    "Common",
                    "Legends Awakened"
            },
            {
                    "Greninja",
                    "https://images.pokemontcg.io/xy0/14.png",
                    "",
                    "Kalos Starter Set"
            },
            {
                    "Magneton",
                    "https://images.pokemontcg.io/ex16/16.png",
                    "Rare",
                    "Power Keepers"
            }
    };

    public static ArrayList<PokemonModel> getPokeData(){
        PokemonModel pokeModel = null;
        ArrayList<PokemonModel> list = new ArrayList<>();
        for (String[] aData:data){
            pokeModel = new PokemonModel();
            pokeModel.setName(aData[0]);
            pokeModel.setImage(aData[1]);
            pokeModel.setRarity(aData[2]);
            pokeModel.setSet(aData[3]);

            list.add(pokeModel);
        }
        return list;
    }
}
