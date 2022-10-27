package game_test;

public class Field {
    private int[] fieldValue = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
    String[] fieldName = {"start", "Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery", "Black cave", "Huts in the mountain", "The Werewall", "The pit", "Goldmine"};
    private int playerPlacement;


    public void setPlayerPlacement(int playerPlacement) {
            this.playerPlacement = playerPlacement;
    }

    public int getPlayerPlacement() {
        return playerPlacement;
    }

    public void resetPlayerPlacement(){
        playerPlacement = 0;
    }

    public int getFieldValue(int fieldValue) {
        return this.fieldValue[this.playerPlacement - 1];
    }
}
