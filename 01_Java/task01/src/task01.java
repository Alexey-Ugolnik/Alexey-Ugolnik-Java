import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        double b = 0.16D;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш вес:");
        int a = scanner.nextInt();
        System.out.print("Вес на луне = " + a * b);
    }
}
