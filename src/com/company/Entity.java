package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cvoss on 3/22/2018.
 */
public class Entity {
    protected int currency;
    ArrayList<Card> hand;
    Random rand;
    int betPool;
    public Entity(){
    hand = new ArrayList<>();
    rand = new Random();
    }

    protected void Bet(int currency, int bet) {
        this.currency = currency;
        this.currency -= bet;
        this.betPool += bet;
    }

    protected void Win(int betPool){
        this.currency += betPool;
    }
}