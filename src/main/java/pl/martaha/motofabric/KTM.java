package pl.martaha.motofabric;

public class KTM extends Motorcycle {

    public KTM() {
        model = "KTM";
        type= "enduro";
        price = 20000;
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
