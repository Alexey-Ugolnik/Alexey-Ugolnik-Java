public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(1, "Star", "Mark", 5.3);

        cat1.setAge(3);
        cat1.setName("Moon");
        cat1.setOwnerFullName("Bill");
        cat1.setWeight(7.1);

        System.out.println("*** First Cat ***");
        System.out.println("age: " + cat1.getAge());
        System.out.println("name: " + cat1.getName());
        System.out.println("owner full name: " + cat1.getOwnerFullName());
        System.out.println("weight: " + cat1.getWeight());

        System.out.println();
        System.out.println("*** Second Cat ***");
        System.out.println("age: " + cat2.getAge());
        System.out.println("name: " + cat2.getName());
        System.out.println("owner full name: " + cat2.getOwnerFullName());
        System.out.println("weight: " + cat2.getWeight());
    }
}
