public class Account {

    private int balancePlayer1;
    private int balancePlayer2;

    public int getBalancePlayer1() {
        return balancePlayer1;
    }

    public int getBalancePlayer2() {
        return balancePlayer2;
    }

    public void setBalancePlayer1(int balancePlayer1) {
        this.balancePlayer1 += balancePlayer1;
    }

    public void setBalancePlayer2(int balancePlayer2) {
        this.balancePlayer2 += balancePlayer2;
    }
}
