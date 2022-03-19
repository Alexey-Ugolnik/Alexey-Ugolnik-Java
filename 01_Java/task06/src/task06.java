public class task06 {
    public static void main(String[] args) {
        int numbers = 1;
        System.out.println("Массив:");
        int[] array = new int[100];
        for (int i = 0; i <= 99; i++) {
            array[i] = numbers;
            System.out.print(array[i] + " ");
            numbers++;
        }
        System.out.println();
        System.out.println("Чётные числа от 1 до 100 не используя остаток от деления (только цикл for):");
        for (int a = 1; a <= 100; a = a + 2) {
            System.out.print(array[a] + " ");
        }
    }
}
