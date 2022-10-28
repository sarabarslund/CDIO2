package game;

import java.util.Random;

public class Dices {
    // Sets variables
    private final Random random = new Random();
    private int dice1, dice2;
    private static final int sides = 6;
    // Gets both dices at once
    public int getDices() {
        return dice1 + dice2;
    }
    // Gets first dice
    public int getDice1() {
        return dice1;
    }
    // gets 2. dice
    public int getDice2() {
        return dice2;
    }
    // Rolls the dices
    public void rollDices() {
        this.dice1 = random.nextInt(1, sides + 1);
        this.dice2 = random.nextInt(1, sides + 1);

    }
}
