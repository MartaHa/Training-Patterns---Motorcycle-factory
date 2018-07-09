package pl.martaha.motofabric;

abstract class Motorcycle {


    protected String model;
    protected String type;
    protected int price;
    public abstract Motorcycle getMotorcycle();
    protected void ride(){
        System.out.println("Ride");
    }
}
