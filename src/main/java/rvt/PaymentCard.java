package rvt;

public class PaymentCard {
    private double balance;
    private double amount;


    public PaymentCard(double openingBalance) {
        this.balance += openingBalance;
        // write code here
    }

    public void eatAffordably() {
        if (balance >= 2.60){
            balance-= 2.60;
        }

    }

    public void eatHeartily() {
        if (balance >= 4.60){
            this.balance -= 4.60;
        } 

    }


    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void addMoney(double amount){
        if (amount <= 0){
        ;
        }

        else {
            balance += amount;
        }
    }
}