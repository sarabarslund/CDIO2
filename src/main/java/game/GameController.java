package game;

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
        Custom_GUI.customgui.showMessage("Start Game");
        while (true){
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
                Custom_GUI.moveCar(F.player1Placement - 1, Custom_GUI.getPlayer1());
                if(F.player1Placement == 10){
                    turnSwitch--;
                    Custom_GUI.resetBoard();
                    Custom_GUI.customgui.showMessage("Start Next round");
                }
            }
            else {
                F.setPlayer2Placement(dices.getDices());
                Custom_GUI.moveCar(F.player2Placement - 1, Custom_GUI.getPlayer2());
                if(F.player2Placement == 10){
                    turnSwitch--;
                    Custom_GUI.resetBoard();
                    Custom_GUI.customgui.showMessage("Start Next round");
                }
            }

            // Sets the players points

            if (currentPlayer == 1){
                acc.setBalancePlayer1(F.getFieldValuePlayer1());
                Custom_GUI.player1.setBalance(acc.getBalancePlayer1());
            } else {
                acc.setBalancePlayer2(F.getFieldValuePlayer2());
                Custom_GUI.player2.setBalance(acc.getBalancePlayer2());
            }

            // Shows players new points

            if (currentPlayer == 1){
                System.out.println("Hello");
                System.out.println(acc.getBalancePlayer1());
            } else {
                System.out.println("no");
                System.out.println(acc.getBalancePlayer2());
            }
            if(F.player2Placement != 0 && F.player1Placement != 0){
                Custom_GUI.resetBoard();
                F.resetPlayerPlacement();
                Custom_GUI.customgui.showMessage("Start Next round");
            }
            // starts over til win condition is hit.
            if(acc.getBalancePlayer1() > 3000 || acc.getBalancePlayer2() > 3000){
                if(acc.getBalancePlayer1() > 3000){
                    System.out.println("Player 1 Won");
                } else{
                    System.out.println("Player 2 Won");
                }
                break;
            }






        }
        Custom_GUI.customgui.close();

    }
}
