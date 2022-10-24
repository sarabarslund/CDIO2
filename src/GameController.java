public class GameController {
    public void playgame() {

        //TODO logic goes here!
        Custom_GUI custom_gui = new Custom_GUI();
        Dice dice = new Dice();
        int roll = dice.roll();
        int roll2 = dice.roll();
        System.out.println("rolls:" + (roll+roll2));

    }
}
