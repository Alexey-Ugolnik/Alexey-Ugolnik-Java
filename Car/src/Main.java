import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        Car[] cars = Utils.generate(10);
        sort(cars);
        for (Car car : cars) {
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println(car);
            car.startEngine();
            car.moving();
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
