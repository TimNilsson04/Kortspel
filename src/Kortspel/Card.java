package Kortspel;

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

    public Card(String name, int hp, int dp) {
        this.name = name;
        this.hp = hp;
        this.dp = dp;



    }
}


