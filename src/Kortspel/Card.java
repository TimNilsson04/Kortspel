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

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void battle(Card enemy) {
        if (this.getHp() > 0 && enemy.getHp() > 0) {
            int dmg = this.getDp();
            System.out.println(this.getName() + " Attacked " + enemy.getName() + " For " + dmg + " dmg");
            enemy.setHp(enemy.getHp() - dmg);
            if (enemy.getHp() < 0 && this.getHp() > 0) {
                enemy.setHp(0);
                System.out.println(this.getName() + " Died");

            } else {
                System.out.println("Next round");
            }
        }
    }


    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", dp=" + dp +
                '}';
    }

    public Card(String name, int hp, int dp) {
        this.name = name;
        this.hp = hp;
        this.dp = dp;
    }

}


