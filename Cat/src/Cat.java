public class Cat {
    private int age;
    private String name;
    private String ownerFullName;
    private double weight;

    public Cat() {
        System.out.println("In default Constructor");
    }

    public Cat(int age, String name, String ownerFullName, double weight) {
        System.out.println("In Constructor with params");
        this.age = age;
        this.name = name;
        this.ownerFullName = ownerFullName;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (Double.compare(cat.weight, weight) != 0) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;
        return ownerFullName != null ? ownerFullName.equals(cat.ownerFullName) : cat.ownerFullName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ownerFullName != null ? ownerFullName.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", weight=" + weight +
                '}';
    }
}
