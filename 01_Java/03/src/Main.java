import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rev = 0;
        int rem, num;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        num = s.nextInt();
        int n = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (n == rev) {
            System.out.println(n + " введённое число");
            System.out.println(rev + " реверсивное число");
            System.out.println("Число " + n + " является палиндромом");
        }
        else {
            System.out.println(n + " введённое число");
            System.out.println(rev + " реверсивное число");
            System.out.println("Число " + n + " не является палиндромом");
        }
    }
}
