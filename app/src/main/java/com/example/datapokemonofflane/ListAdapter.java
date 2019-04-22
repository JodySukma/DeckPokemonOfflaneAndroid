package com.example.datapokemonofflane;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private Context context;
    private ArrayList<PokemonModel> mypokemon;

    public ListAdapter(Context context, ArrayList<PokemonModel> mypokemon) {
        this.context = context;
        this.mypokemon = mypokemon;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pokemon, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder viewHolder, final int index) {
        viewHolder.tvNamaPokemon.setText(mypokemon.get(index).getName());
        viewHolder.tvRarity.setText(mypokemon.get(index).getRarity());
        viewHolder.tvSet.setText(mypokemon.get(index).getSet());
        Glide.with(context)
                .load(mypokemon.get(index).getImage())
                .placeholder(R.mipmap.ic_launcher_round)
                .into(viewHolder.imgPokemon);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsPokemonActivity.class);
                intent.putExtra(DetailsPokemonActivity.EXTRA_POKEMON, mypokemon.get(index));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mypokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaPokemon;
        ImageView imgPokemon;
        TextView tvRarity;
        TextView tvSet;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamaPokemon = itemView.findViewById(R.id.nama_pokemon);
            tvRarity = itemView.findViewById(R.id.kelangkaan_pokemon);
            tvSet = itemView.findViewById(R.id.deck_pokemon);
            imgPokemon = itemView.findViewById(R.id.img_pokemon);

        }
    }
}
