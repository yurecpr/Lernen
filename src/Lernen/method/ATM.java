package Lernen.method;

public class ATM {

    public static void main(String[] args) {
        int amount = 27; // Замените это значение на нужную вам сумму
        int result = countNotes(amount);
        System.out.println("Минимальное количество банкнот для суммы " + amount + " равно " + result);
    }

    public static int countNotes(int amount) {
        int tenNotes = amount / 10;
        int remainder = amount % 10;

        int fiveNotes = remainder / 5;
        remainder %= 5;

        int oneNotes = remainder;

        return tenNotes + fiveNotes + oneNotes;
    }
}
