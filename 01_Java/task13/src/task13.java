import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первой строковой переменной");
        String lineOne = scanner.nextLine();
        System.out.println("Введите значение второй строковой переменной");
        String lineTwo = scanner.nextLine();
        String lineThree = lineOne + " " + lineTwo;
        System.out.println("Значение третьей строковой переменной:");
        System.out.println(lineThree);
    }
}
