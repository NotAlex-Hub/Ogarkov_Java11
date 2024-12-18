import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word1 = word.nextLine();
        System.out.println("Введите второе слово: ");
        String word2 = word.nextLine();

        if (word1.equals(word2)) {
            System.out.println("Строки идентичны");
        }
        else {
            System.out.println("Строки неидентичны");
        }
    }
}