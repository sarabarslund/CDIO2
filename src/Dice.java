import java.util.Random;
public class Dice {
    private static final int sides = 6;
        public int roll(){
            return new Random().nextInt(1, sides+1);
        }
}