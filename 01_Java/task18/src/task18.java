import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара к рублю: 1$ = ");
        double exch = scanner.nextDouble();

        System.out.println("Введите кол-во рублей:");
        double rub = scanner.nextDouble();
        double usd = rub / exch;
        String result = String.format("%.2f", usd);
        System.out.println(rub + " RUB = " + result + " USD Если считать по курсу: 1$ = " + exch);
    }
}
