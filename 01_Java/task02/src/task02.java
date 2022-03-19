import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        double array[] = new double[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.println("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("Массив + 10%");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] * 1.1);
        }
    }
}
