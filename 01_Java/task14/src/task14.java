import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первой переменной");
        int numberOne = scanner.nextInt();
        System.out.println("Введите значение второй переменной");
        int numberTwo = scanner.nextInt();
        if  (numberOne > numberTwo) {
            numberOne = numberOne + 3;
        }
        else {
            numberTwo = numberTwo + 8;
        }
        System.out.print("Итоговые значения: первое = " + numberOne + ", второе = " + numberTwo);
    }
}
