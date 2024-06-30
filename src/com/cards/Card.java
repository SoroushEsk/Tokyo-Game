package com.cards;

public abstract class Card {
    private String name;

    public String getName(){return this.name;}
    public abstract void apply();

}
