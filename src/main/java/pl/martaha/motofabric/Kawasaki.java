package pl.martaha.motofabric;

public class Kawasaki extends Motorcycle {

    public Kawasaki() {
        model = "Kawasaki";
        type= "speeder";
        price = 25000;
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
