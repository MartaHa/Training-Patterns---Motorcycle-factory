package pl.martaha.motofabric;

public class Yamaha extends Motorcycle {

    public Yamaha() {
        model = "Yamaha";
        type= "touring";
        price = 30000;
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
