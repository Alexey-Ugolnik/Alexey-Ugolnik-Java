import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = scanner.nextInt();

        System.out.println("Вы ввели: " + number1 + " " + number2 + " " + number3);

        if (number1 >= number2 & number1 >= number3) {
            System.out.println("Большее число: " + number1);
        }
        else if (number2 >= number1 & number2 >= number3) {
            System.out.println("Большее число: " + number2);
        }
        else {
            System.out.println("Большее число: " + number3);
        }
    }
}
