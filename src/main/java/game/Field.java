package game;

public class Field {
    private int[] fieldValue = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
    String[] fieldName = {"start", "Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery", "Black cave", "Huts in the mountain", "The Werewall", "The pit", "Goldmine"};
    public int player1Placement = 0;
    public int player2Placement = 0;


    public void setPlayer1Placement(int player1Placement) {
            this.player1Placement = player1Placement;
    }

    public void setPlayer2Placement(int player2Placement) {
            this.player2Placement = player2Placement;
    }
    public void resetPlayerPlacement(){
        player1Placement = 0;
        player2Placement = 0;
    }
    public int getFieldValuePlayer1() {
        return this.fieldValue[this.player1Placement - 1];
    }
    public int getFieldValuePlayer2() {
        return fieldValue[player2Placement - 1];
    }

    public int[] getFieldValue() {
        return fieldValue;
    }
}
