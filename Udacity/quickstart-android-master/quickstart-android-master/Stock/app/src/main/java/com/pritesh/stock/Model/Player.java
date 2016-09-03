package com.pritesh.stock.Model;

/**
 * Created by Pritesh on 8/26/2016.
 */
public class Player {
    private int cash;
    private  String name;
    private long id;
    Stocks stock;

    public Stocks getStocks() {
        return stock;
    }

    public void setStocks(Stocks stocks) {
        this.stock = stocks;
    }

    public Player() {
        id=0;
        cash=60000;
        stock=new Stocks();
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
