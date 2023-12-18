package HA.Lesson28;

public class Main {
    public static void main(String[] args) {
        Money money = new Money("USD", 50.0);
        Money money1 = new Money("EUR", 35.0);
        Wallet wallet = new Wallet(money);
        Wallet wallet1 = new Wallet(money1);


        Money moneyInWallet = wallet.getMoney();

        System.out.println("Money in wallet: " + moneyInWallet);

        System.out.println("Money in wallet1:" + wallet1);

    }
}