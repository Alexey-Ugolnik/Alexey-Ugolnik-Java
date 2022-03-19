import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Можно вводить только true или false!!!");
        System.out.println("Введите первое значение");
        boolean meaning1 = scanner.nextBoolean();
        System.out.println("Введите второе значение");
        boolean meaning2 = scanner.nextBoolean();

        if (meaning1) {
            System.out.println("Первое значение Истина");
        }
        else {
            System.out.println("Первое значение Ложь");
        }
        if (meaning2) {
            System.out.println("Второе значение Истина");
        }
        else {
            System.out.println("Второе значение Ложь");
        }
    }
}
