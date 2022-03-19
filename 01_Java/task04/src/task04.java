public class task04 {
    public static void main(String[] args) {
        int numbers = 1;
        System.out.println("Чётные числа от 1 до 100:");
        int[] array = new int[100];
        for (int i = 0; i <= 99; i++) {
            array[i] = numbers;
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
            numbers++;
        }
    }
}
