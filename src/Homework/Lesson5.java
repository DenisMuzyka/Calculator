package Homework;

public class Lesson5 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.balance = 200.5;
        System.out.println("Баланс после пополнения равен " + ba.popolnenieScheta());
        System.out.println("Баланс после снятия равен " + ba.snyatieSoScheta(100));

    }
}


class BankAccount {
    double balance;
    double popolnenieScheta() {
        balance += 50;
        return balance;
    }
    double snyatieSoScheta (double snyatie){
        balance-=snyatie;
        return balance;
        }


}

