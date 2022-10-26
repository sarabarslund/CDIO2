package game;

import java.util.Scanner;

public class GameController {
    Scanner sc = new Scanner(System.in);
    // Starts relevant classes

    Account acc1 = new Account();
    Account acc2 = new Account();
    Field fieldP1 = new Field();
    Field fieldP2 = new Field();
    Player player = new Player();
    Dices dices = new Dices();

    // Sets starting balance

    public void startBalance() {
        acc1.setBalance(1000);
        acc2.setBalance(1000);
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
                fieldP1.setPlayerPlacement(dices.getDices());
                Custom_GUI.moveCar(fieldP1.getPlayerPlacement() - 1, Custom_GUI.getPlayer1());
                if(fieldP1.getPlayerPlacement() == 10){
                    turnSwitch--;
                    Custom_GUI.resetBoard();
                    Custom_GUI.customgui.showMessage("Start Next round");
                }
            }
            else {
                fieldP2.setPlayerPlacement(dices.getDices());
                Custom_GUI.moveCar(fieldP2.getPlayerPlacement() - 1, Custom_GUI.getPlayer2());
                if(fieldP2.getPlayerPlacement() == 10){
                    turnSwitch--;
                    Custom_GUI.resetBoard();
                    Custom_GUI.customgui.showMessage("Start Next round");
                }
            }

            // Sets the players points

            if (currentPlayer == 1){
                acc1.setBalance(fieldP1.getFieldValue(fieldP1.getPlayerPlacement()));
                Custom_GUI.player1.setBalance(acc1.getBalance());
            } else {
                acc2.setBalance(fieldP2.getFieldValue(fieldP2.getPlayerPlacement()));
                Custom_GUI.player2.setBalance(acc2.getBalance());
            }

            // Shows players new points

            if (currentPlayer == 1){
                System.out.println("Hello");
                System.out.println(acc1.getBalance());
            } else {
                System.out.println("no");
                System.out.println(acc2.getBalance());
            }
            if(fieldP1.getPlayerPlacement() != 0 && fieldP2.getPlayerPlacement() != 0){
                Custom_GUI.resetBoard();
                fieldP1.resetPlayerPlacement();
                Custom_GUI.customgui.showMessage("Start Next round");
            }
            // starts over til win condition is hit.
            if(acc1.getBalance() > 3000 || acc2.getBalance() > 3000){
                if(acc1.getBalance() > 3000){
                    System.out.println("Player 1 Won");
                } else{
                    System.out.println("Player 2 Won");
                }
                break;
            }

            // starts over til win condition is hit.
            if(acc1.getBalance() < 0 || acc2.getBalance() < 0){
                if(acc1.getBalance() < 0){
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
