import java.util.Arrays;

public class Utils {

    public static Car[] generate(int counter) {
        Car[] car = new Car[counter];
        for (int arrayElementCounter = 0; arrayElementCounter < car.length; arrayElementCounter++) {
            car[arrayElementCounter] = new Car();
        }
        return car;
    }

    public static <Car> void sort(Car[] car) {
        Arrays.sort(car);
    }

}