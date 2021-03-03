package tddClass;

public class Account {
    double balance;
    private int pin;

    public void depositMoney(double amount) {
        if (amount >= 0) {
            balance += amount;
        }

    }

    public double getAccountBalance() {
        return balance;
    }


    public void setPin(int newPin) {
        pin = newPin;
    }

    public void withdrawMoney(int amountToWithdraw, int pin) {
        if(pin == this.pin) {
            balance = balance - amountToWithdraw;
        }
    }
}
