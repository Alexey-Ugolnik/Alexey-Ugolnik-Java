import java.util.Objects;

public class Car implements CarMovement, EngineVolume, Brands, Comparable<Car> {

    private int doors;
    private double engineVolume;
    private int wheels;
    private int pedals;
    private int mirrors;
    private String model;
    private String brand;

    public Car() {
        this.doors = 0;
        this.engineVolume = randomEngineVolume();
        this.wheels = 4;
        this.pedals = 2;
        this.mirrors = 3;
        this.brand = randomBrand();
        this.model = "Formula 1";


    }

    public Car(int doors, double engineVolume, int wheels, int pedals, int mirrors, String brand, String model) {
        this.doors = doors;
        this.engineVolume = engineVolume;
        this.wheels = wheels;
        this.pedals = pedals;
        this.mirrors = mirrors;
        this.brand = brand;
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPedals() {
        return pedals;
    }

    public void setPedals(int pedals) {
        this.pedals = pedals;
    }

    public int getMirrors() {
        return mirrors;
    }

    public void setMirrors(int mirrors) {
        this.mirrors = mirrors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors && engineVolume == car.engineVolume && wheels == car.wheels && pedals == car.pedals && mirrors == car.mirrors && Objects.equals(model, car.model) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doors, engineVolume, wheels, pedals, mirrors, model, brand);
    }

    @Override
    public String toString() {
        return "Car: " +
                "doors = " + doors +
                ", engineVolume = " + engineVolume +
                ", wheels = " + wheels +
                ", pedals = " + pedals +
                ", mirrors = " + mirrors +
                ", brand = " + brand +
                ", model = " + model;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine");
    }

    @Override
    public void moving() {
        System.out.println("GO! GO! GO!");
    }

    @Override
    public int compareTo(Car car) {
        return brand.compareTo(car.getBrand());
    }

}