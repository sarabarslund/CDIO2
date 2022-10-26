package game;

import java.util.Scanner;

import static game.Custom_GUI.customgui;

public class GameController {
    Scanner sc = new Scanner(System.in);
    // Starts relevant classes

    private final Account acc1 = new Account();
    private final Account acc2 = new Account();
    private final Field fieldP1 = new Field();
    private final Field fieldP2 = new Field();
    private final Player player = new Player();
    private final Dices dices = new Dices();


    // Sets starting balance

    public void startBalance() {
        acc1.setBalance(1000);
        acc2.setBalance(1000);
    }

    // Starts the game loop. Ends loop when someone hits 3000

    public void startGame() {

        //GUI StartUp
        Custom_GUI custom_gui = new Custom_GUI();
        custom_gui.startGameGUI();

        // Var for turns
        int turnSwitch = 0;
        int currentPlayer;

        // Win condition
        customgui.showMessage("Start Game");
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
            customgui.setDice(dices.getDice1(), dices.getDice2());

            // moves the piece
            if (currentPlayer == 1){
                fieldP1.setPlayerPlacement(dices.getDices());
                Custom_GUI.moveCar(fieldP1.getPlayerPlacement(), Custom_GUI.getPlayer1());

            }
            else {
                fieldP2.setPlayerPlacement(dices.getDices());
                Custom_GUI.moveCar(fieldP2.getPlayerPlacement(), Custom_GUI.getPlayer2());
            }

            // Shows players new points
            if (currentPlayer == 1){
                acc1.setBalance(fieldP1.getFieldValue(fieldP1.getPlayerPlacement()));
                if(acc1.negativeBalance() == false){break;}
                Custom_GUI.player1.setBalance(acc1.getBalance());
            } else {
                acc2.setBalance(fieldP2.getFieldValue(fieldP2.getPlayerPlacement()));
                if(acc2.negativeBalance() == false){break;}
                Custom_GUI.player2.setBalance(acc2.getBalance());
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

            // Information about plater movement, must be last as it pauses program
            customgui.showMessage("Player " + currentPlayer + " moved to " + (dices.getDices()));

            if(fieldP1.getPlayerPlacement() == 10){
                turnSwitch--;
                Custom_GUI.resetBoard();
                customgui.showMessage("Start Next round");
            }else if(fieldP2.getPlayerPlacement() == 10){
                turnSwitch--;
                Custom_GUI.resetBoard();
                customgui.showMessage("Start Next round");
            }


            // Sets the players to start position for start of new round
            if(fieldP1.getPlayerPlacement() != 0 && fieldP2.getPlayerPlacement() != 0){
                System.out.println("I resat the board");
                Custom_GUI.resetBoard();
                fieldP1.resetPlayerPlacement();
                fieldP2.resetPlayerPlacement();
                customgui.showMessage("Start Next round");
            }



        }
        customgui.close();

    }
}
