package tddClass;

public class AtmMachine {

        private int pin;
        private double balance;

        public void setPin(int newPin) {
            pin = newPin;
            System.out.println("Pin Set Successfully");
        }

        public int getPin() {
            return pin;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0.0)
                balance += amount;
        }

        public void withdraw(double cash, int pin) {
            if (cash > 0.0 && cash < balance && this.pin == pin) {
                System.out.println("Your Withdrawal Was Successful");
                balance = balance - cash;
            }
            else if (balance < cash ) {
                System.out.println("Insufficient Fund");
            }
            else if (this.pin != pin) {
                System.out.println("Invalid Pin\nTry Again!!!");
            }
        }

        public void transfer(double wire, int pin) {
            if (wire > 0.0 && wire < balance && this.pin == pin) {
                balance = balance - wire;
                System.out.println("Transfer was successful");
            } else if (wire > balance) {
                System.out.println("Insufficient Fund!!!");
            } else if (this.pin != pin) {
                System.out.println("Invalid Pin\nTry Again!!!");
            }
        }

        public void recharge(double bills, int pin) {
            if (bills > 0.0 && bills < balance && this.pin == pin){
                balance -= bills;
                System.out.println("Recharge Was Successful");
            }
            else if(bills > balance) {
                System.out.println("Insufficient Fund!!!");
            }
            if(this.pin != pin){
                System.out.println("Invalid Pin\nTry Again!!!");
            }
        }
        public void changePin(int changePin) {
            pin = changePin;
            System.out.println("Pin Changed\nKeep Your Pin Safe");
        }

    }
