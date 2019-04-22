package com.example.datapokemonofflane;

import android.os.Parcel;
import android.os.Parcelable;

class PokemonModel implements Parcelable {
    private String name;
    private String image;
    private String rarity;
    private String set;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.image);
        dest.writeString(this.rarity);
        dest.writeString(this.set);
    }

    public PokemonModel() {
    }

    protected PokemonModel(Parcel in) {
        this.name = in.readString();
        this.image = in.readString();
        this.rarity = in.readString();
        this.set = in.readString();
    }

    public static final Parcelable.Creator<PokemonModel> CREATOR = new Parcelable.Creator<PokemonModel>() {
        @Override
        public PokemonModel createFromParcel(Parcel source) {
            return new PokemonModel(source);
        }

        @Override
        public PokemonModel[] newArray(int size) {
            return new PokemonModel[size];
        }
    };
}
