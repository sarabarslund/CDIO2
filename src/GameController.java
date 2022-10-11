public class GameController {
    public void playgame() {
        //TODO logic goes here!
        Dice dice = new Dice();
        Dice dice2 = new Dice();
        int roll = dice.roll();
        int roll2 = dice2.roll();
        System.out.println("rolls:" + (roll+roll2));


    }
}
