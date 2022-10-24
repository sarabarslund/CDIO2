package main.java;

public class Field {
    private int[] fieldValue = {0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
    String[] fieldName = {"start", "Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery", "Black cave", "Huts in the mountain", "The Werewall", "The pit", "Goldmine"};
    private int player1Placement = 0;
    private int player2Placement = 0;


    public void setPlayer1Placement(int player1Placement) {

        if (this.player1Placement + player1Placement <= 12) {
            this.player1Placement += player1Placement;
        }
        else {
            this.player1Placement = this.player1Placement - 12 + player1Placement;
        }
    }

    public void setPlayer2Placement(int player2Placement) {
        if (this.player2Placement + player2Placement <= 12)
            this.player2Placement += player2Placement;
        else {
            this.player2Placement = this.player2Placement - 12 + player2Placement;
        }
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
