import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите число");
        int a = keyboard.nextInt();
        System.out.println("Введите второе число");
        int b = keyboard.nextInt();
        System.out.println("Результат:");

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        System.out.println("Сумма: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));

        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Ошибка");
        }

    }
}