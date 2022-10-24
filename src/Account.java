public class Account {
    int balance;
    //Sets balance to 0
    public Account() {
        balance = 0;
    }
    //Adds and subtracts points
    public void edit(int amount) {
        balance += amount;
    }
    //Gets balance
    public int getBalance() {
        return balance;
    }
}
