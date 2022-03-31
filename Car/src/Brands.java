public interface Brands {

    String[] arrayBrands = {
            "McLaren",
            "Alpha Tauri",
            "Alfa Romeo",
            "Red Bull Racing",
            "Mercedes",
            "Alpine",
            "Aston Martin",
            "Williams",
            "Firrari",
            "Haas"
    };

    default String randomBrand() {
        String[] brands = arrayBrands;
        int numberBrand = (int) Math.floor(Math.random() * brands.length);
        return brands[numberBrand];
    }

}