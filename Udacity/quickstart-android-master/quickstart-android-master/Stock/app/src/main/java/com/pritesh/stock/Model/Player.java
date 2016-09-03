package com.pritesh.stock.Model;

/**
 * Created by Pritesh on 8/26/2016.
 */
public class Player {
    private int cash;
    private  String name;
    private long id;


    public Player() {
        cash=60000;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
