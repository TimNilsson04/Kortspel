package Kortspel;

import javax.swing.*;

public class Card{

    String name;
    int hp;
    int dp;


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDp() {
        return dp;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", dp=" + dp +
                '}';
    }

    public String playAgainst(Card other){

        return null;
    }

    public Card(String name, int hp, int dp) {
        this.name = name;
        this.hp = hp;
        this.dp = dp;

        JOptionPane.showInputDialog("Choose which card you want to play: \n Soldier \n Wizard \n Rogue \n Archer");


    }

}


