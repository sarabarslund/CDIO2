package game;

public class Account {

    //Balance variable
    private int Balance;

    // Sets balance
    public void setBalance(int balance) {
        Balance += balance;
    }
    // Checks for negative balance
    public boolean negativeBalance(){
        if (Balance < 0)
            return false;
        else {
            return true;
        }
    }
    // Gets balance
    public int getBalance() {
        return Balance;
    }
}
