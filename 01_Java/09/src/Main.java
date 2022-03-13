import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();

        System.out.println("Вы ввели числа: " + number1 + " и " + number2);

        int amount = number1 + number2;
        number1 = amount - number1;
        number2 = amount - number2;

        System.out.println("А я поменял их местами: " + number1 + " и " + number2);
    }
}
