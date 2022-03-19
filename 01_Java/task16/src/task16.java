import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальное число");
        int min = scanner.nextInt();
        System.out.println("Введите максимальное число");
        int max = scanner.nextInt();
        System.out.println("Введите шаговое значение");
        int step = scanner.nextInt();

        int size = 1;
        int phantomMin = min;
        while (phantomMin != max) {
            phantomMin++;
            size++;
        }

        System.out.println("Кол-во чисел от " + min + " до " + max + ": " + size);

        phantomMin = min;
        int [] array = new int[size];
        System.out.println("Массив:");
        for (int i = 0; i < size; i++) {
            array[i] = phantomMin;
            System.out.print(array[i] + " ");
            phantomMin ++;
        }

        System.out.println();
        System.out.println("Массив с указанным шагом:");
        for (int i = 0; i < size; i = i + step) {
            System.out.print(array[i] + " ");
        }
    }
}
