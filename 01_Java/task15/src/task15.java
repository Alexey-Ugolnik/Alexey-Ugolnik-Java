public class task15 {
    public static void main(String[] args) {
        int numbers = 1;
        int a = 0;
        int[] arrayOne = new int[100];
        for (int i = 0; i < 100; i++) {
            arrayOne[i] = numbers;
            System.out.print(arrayOne[i] + " ");
            numbers++;
        }
        System.out.println();
        numbers = 1;
        while(a < 100) {
            arrayOne[a] = numbers;
            System.out.print(arrayOne[a] + " ");
            numbers++;
            a++;
        }
        System.out.println();
        numbers = 1;
        a = 0;
        do {
            arrayOne[a] = numbers;
            System.out.print(arrayOne[a] + " ");
            numbers++;
            a++;
        }
        while(a < 100);
    }
}
