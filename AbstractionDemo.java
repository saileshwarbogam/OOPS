package com.oop;
class Bank{
    private float balance=1;
    public void setBalance(float bal){
        this.balance = bal;
    }

    public float getBalance() {
        return balance;
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Bank sbi = new Bank();
        sbi.setBalance(7892355);
        System.out.println(sbi.getBalance());
    }
}