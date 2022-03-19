import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива:");
        int size = scanner.nextInt();
        double[] array = new double[size];
        int number = 1;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + number + " элемент массива: ");
            array[i] = scanner.nextDouble();
            number++;
        }

        double max = array[0];
        System.out.println("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Максиальный элемент массива = " + max);

        System.out.println("Каждый элемент массива поделили на максимальное значение среди всех его элементов. Итог:");
        for (int i = 0; i < size; i++) {
            array[i] = array[i] / max;
            System.out.print(array[i] + " ");
        }
    }
}
