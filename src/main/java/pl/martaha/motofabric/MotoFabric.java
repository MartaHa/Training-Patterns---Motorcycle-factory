package pl.martaha.motofabric;

public class MotoFabric {

    public Motorcycle motoFabric(String brand) {
        Motorcycle motorcycle = null;
        if (brand.equalsIgnoreCase("HARLEYDAVIDSON")) {
            motorcycle = new HarleyDavidson();
        }
        if (brand.equalsIgnoreCase("YAMAHA")) {
            motorcycle = new Yamaha();
        }
        if (brand.equalsIgnoreCase("KAWASAKI")) {
            motorcycle = new Kawasaki();
        }
        if (brand.equalsIgnoreCase("KTM")) {
            motorcycle = new KTM();
        }
        return motorcycle.getMotorcycle();
    }
}
