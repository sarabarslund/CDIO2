package game;

import java.util.Random;

public class Dices {

    private final Random random = new Random();
    private int dice1, dice2;

    public int getDices() {
        return dice1 + dice2;
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public void rollDices() {
        this.dice1 = random.nextInt(1, 7);
        this.dice2 = random.nextInt(1, 7);

    }
}
