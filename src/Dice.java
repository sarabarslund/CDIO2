import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        // Indsætter værdier
        int dice1, dice2;

        dice1 = new Random().nextInt(1, 7);
        dice2 = new Random().nextInt(1, 7);

        System.out.println("Dice 1 roll: " + dice1 + ", dice 2 roll: " + dice2 + ".");
    }
}