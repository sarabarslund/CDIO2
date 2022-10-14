public class Turn {
    public static int turn_number = 0;

    public static int playerTurn(int turn_number){
        if (turn_number % 2 == 0) {
            System.out.println(" ");
        } else {
            System.out.println();
        }
        return 1;
    }
}
