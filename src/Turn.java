public class Turn {
    public static int turn_number = 0;

    public static int playerTurn(int turn_number){
        int turn = 0;
        if (turn_number % 2 == 0) {

            System.out.println("Player one's turn");
            turn = 1;
        } else {
            System.out.println("Player two's turn");
            turn = 2;
        }
        return turn;
    }
}
