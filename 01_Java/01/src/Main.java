import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b = 0.16D;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш вес:");
        int a = scanner.nextInt();
        System.out.print("Вес на луне = " + (double)a * b);
    }
}
