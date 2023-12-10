package Lernen.method;

public class Numbers365 {

    public static void main(String[] args) {
        int number = 365; // Ваше трехзначное число
        printDigits(number);
        int newNumber = swapDigits(number);
        System.out.println("Новое число после перестановки единиц и сотен: " + newNumber);
    }

    public static void printDigits(int number) {
        int digit1 = number / 100; // Получаем сотни
        int remainder = number % 100;
        int digit2 = remainder / 10; // Получаем десятки
        int digit3 = remainder % 10; // Получаем единицы

        System.out.println("Сотни: " + digit1);
        System.out.println("Десятки: " + digit2);
        System.out.println("Единицы: " + digit3);
    }

    public static int swapDigits(int number) {
        int digit1 = number / 100; // Получаем сотни
        int remainder = number % 100;
        int digit2 = remainder / 10; // Получаем десятки
        int digit3 = remainder % 10; // Получаем единицы

        // Формируем новое число, поменяв местами единицы и сотни
        int newNumber = digit3 * 100 + digit2 * 10 + digit1;
        return newNumber;
    }
}
