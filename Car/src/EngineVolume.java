public interface EngineVolume {

    double[] arrayEngineVolume = {1.6, 2.4, 3.0};

    default double randomEngineVolume() {
        double[] engineVolume = arrayEngineVolume;
        int numberBrand = (int) Math.floor(Math.random() * engineVolume.length);
        return engineVolume[numberBrand];
    }

}