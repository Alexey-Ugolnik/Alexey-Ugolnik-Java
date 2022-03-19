import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int monthNumber = scanner.nextInt();

        String[] array = new String[12];
        for (int i = 0; i <= 12; i++) {
            if (i == 0) {
                array[i] = "январь";
            }
            else if (i == 1) {
                array[i] = "февраль";
            }
            else if (i == 2) {
                array[i] = "март";
            }
            else if (i == 3) {
                array[i] = "апрель";
            }
            else if (i == 4) {
                array[i] = "май";
            }
            else if (i == 5) {
                array[i] = "июнь";
            }
            else if (i == 6) {
                array[i] = "июль";
            }
            else if (i == 7) {
                array[i] = "август";
            }
            else if (i == 8) {
                array[i] = "сентябрь";
            }
            else if (i == 9) {
                array[i] = "октябрь";
            }
            else if (i == 10) {
                array[i] = "ноябрь";
            }
            else if (i == 11) {
                array[i] = "декабрь";
            }
        }

        if (monthNumber >= 1 & monthNumber <= 12){
            System.out.println(array[monthNumber - 1]);
        }
        else {
            System.out.println("Введено некорректное число");
        }
    }
}
