package game;

public class Field {

    // Sets value for fields. Does not change.
    private final int[] fieldValue = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
    String[] fieldName = {"start", "Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery", "Black cave", "Huts in the mountain", "The Werewall", "The pit", "Goldmine"};
    private int playerPlacement;

    // Sets player placement
    public void setPlayerPlacement(int playerPlacement) {
            this.playerPlacement = playerPlacement;
    }

    // Gets player placement
    public int getPlayerPlacement() {
        return playerPlacement;
    }

    // Resets the players placement
    public void resetPlayerPlacement(){
        playerPlacement = 0;
    }

    // Gets value on field
    public int getFieldValue(int fieldValue) {
        return this.fieldValue[this.playerPlacement - 1];
    }
}
