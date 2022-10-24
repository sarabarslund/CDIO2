package main.java;

import java.util.Scanner;

public class GameController {
    Scanner sc = new Scanner(System.in);
    // Starts relevant classes

    Account acc = new Account();
    Field F = new Field();
    Player player = new Player();
    Dices dices = new Dices();

    // Sets starting balance

    public void startBalance() {
        acc.setBalancePlayer1(1000);
        acc.setBalancePlayer2(1000);
    }

    // Starts the game loop. Ends loop when someone hits 3000

    public void startGame() {
        //GUI StartUp
        Custom_GUI custom_gui = new Custom_GUI();


        // Var for turns
        int turnSwitch = 0;
        int currentPlayer = 0;

        // Win condition
        while (acc.getBalancePlayer1() < 3000 || acc.getBalancePlayer2() < 3000){
            // Chooses player to play
            if (turnSwitch%2 == 0){
                currentPlayer = player.getPlayer1();
                turnSwitch += 1;
            }
            else{
                currentPlayer = player.getPlayer2();
                turnSwitch += 1;
            }
            // Lets current player throw the dice:
            dices.rollDices();
            Custom_GUI.customgui.setDice(dices.getDice1(), dices.getDice2());
            // Moves the piece
            if (currentPlayer == 1){
                F.setPlayer1Placement(dices.getDices());
            }
            else {F.setPlayer2Placement(dices.getDices());}

            // Sets the players points

            if (currentPlayer == 1){
                acc.setBalancePlayer1(F.getFieldValuePlayer1());
            } else {acc.setBalancePlayer2(F.getFieldValuePlayer2());}

            // Shows players new points

            if (currentPlayer == 1){
                System.out.println(acc.getBalancePlayer1());
            } else {System.out.println(acc.getBalancePlayer2());;}



            // starts over til win condition is hit.






        }
    }
}
