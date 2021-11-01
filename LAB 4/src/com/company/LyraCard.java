package com.company;

public class LyraCard {
    private double balance;
    private String name;

    public LyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return this.name + ":This card has" + this.balance + "euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance = this.balance - 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4) {
            this.balance = this.balance - 4.0;
        }
    }

    public void loadMoney(double amount) {
        if (amount < 0) {
            this.balance = amount;
            if (this.balance > 150) {
                this.balance = 150;

            }
        }

    }
}