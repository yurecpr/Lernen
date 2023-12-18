package HA.Lesson28;

class Wallet {
    private Money money;

    public Wallet(Money money) {
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return " " + money;
    }
}