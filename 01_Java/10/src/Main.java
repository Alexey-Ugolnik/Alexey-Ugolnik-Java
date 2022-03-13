import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();

        int amount = number1 + number2;

        System.out.print(number1 + " + " + number2 + " = " + amount);
    }
}
