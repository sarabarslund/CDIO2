public class Turn {
    public static int turn_number = 0;

    public static int playerTurn(int turn_number){
        int turn = 0;
        // Testing for player turn
        if (turn_number % 2 == 0) {
            System.out.println("Player one's turn");
            turn = 1;
        } else {
            System.out.println("Player two's turn");
            turn = 2;
        }
        //returning the number of the player whose turn it is
        return turn;
    }
}
