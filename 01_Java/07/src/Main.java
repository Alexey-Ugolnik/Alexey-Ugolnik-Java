public class Main {
    public static void main(String[] args) {
        int numbers = 20;
        int amount = 0;
        System.out.println("Массив:");
        int[] array = new int[181];
        for (int i = 0; i <= 180; i++) {
            array[i] = numbers;
            System.out.print(array[i] + " ");
            amount = amount + array[i];
            numbers++;
        }
        System.out.println();
        System.out.println("Сумма чисел от 20 до 200:");
        System.out.println(amount);
    }
}
