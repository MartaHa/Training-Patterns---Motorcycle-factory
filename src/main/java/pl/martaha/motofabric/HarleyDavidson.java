package pl.martaha.motofabric;

public class HarleyDavidson extends Motorcycle {

    public HarleyDavidson() {
        model = "Harley Davidson";
        type= "chopper";
        price = 50000;
    }

    @Override
    public Motorcycle getMotorcycle() {
        System.out.println("The model is : " +model);
        System.out.println("The type of the motorcycle: " +type);
        System.out.println("Price: " +price);
        ride();
        return this;
    }

}
