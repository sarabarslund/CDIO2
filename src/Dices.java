import java.util.Random;

public class Dices {

    private final Random random = new Random();
    private int dice1, dice2;

    public int getDices() {
        return dice1 + dice2;
    }

    public void rollDices() {
        this.dice1 = random.nextInt(0, 6);
        this.dice2 = random.nextInt(0, 6);

    }
}
