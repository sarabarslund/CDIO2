package game;

public class Main {
    public static void main(String[] args) {
        Custom_GUI custom_gui = new Custom_GUI();
        GameController gameController = new GameController();
        gameController.startBalance();
        gameController.startGame();
    }
}