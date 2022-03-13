public class Main {
    public static void main(String[] args) {
        int numbers = 1;
        System.out.println("Нечётные числа от 1 до 15:");
        int[] array = new int[15];
        for (int i = 0; i <= 14; i++) {
            array[i] = numbers;
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
            numbers++;
        }
    }
}
