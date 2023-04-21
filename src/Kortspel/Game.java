package Kortspel;

public class Game {
    public static void main(String[] args) {
        Soldier player1 = new Soldier();
        System.out.println(player1);
        Rogue player2 = new Rogue();
        System.out.println(player2);

        for (int i = 0; i < 15; i++){
            int start = (int) (Math.random() * 2);
            if (start == 0) {
                System.out.println("The game decided that " + player1.getName() + " attacks");
                player1.battle(player2);
            } else {
                System.out.println("The game decided that " + player2.getName() + " attacks");
                player2.battle(player1);
            }
        }

        System.out.println(player1);
        System.out.println(player2);
    }
}
