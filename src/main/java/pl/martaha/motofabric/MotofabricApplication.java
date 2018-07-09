package pl.martaha.motofabric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MotofabricApplication {

    public static void main(String[] args) {

        MotoFabric fabric = new MotoFabric();
        Motorcycle[] tab = new Motorcycle[4];
        tab[0] = fabric.motoFabric("HARLEYDAVIDSON");
        System.out.println(tab[0].toString());
        tab[1] = fabric.motoFabric("KAWASAKI");
        tab[2] = fabric.motoFabric("KTM");
        tab[3] = fabric.motoFabric("YAMAHA");



        SpringApplication.run(MotofabricApplication.class, args);
    }

}