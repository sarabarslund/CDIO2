package game;

public class Account {
    private int Balance;

    public void setBalance(int balance) {
        Balance += balance;
    }

    public boolean negativeBalance(){
        if (Balance < 0)
            return false;
        else {
            return true;
        }
    }

    public int getBalance() {
        return Balance;
    }
}
