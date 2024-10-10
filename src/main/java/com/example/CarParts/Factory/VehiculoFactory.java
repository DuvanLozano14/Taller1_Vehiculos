package com.example.CarParts.Factory;
import com.example.CarParts.Interface.IVehiculoAbstractFactory;

public class VehiculoFactory {

    public static IVehiculoAbstractFactory getVehiculoFactory(String marca) {
        switch (marca) {
            case "Toyota":
                return new ToyotaFactory();
            case "Ford":
                return new FordFactory();
            case "Mazda":
                return new MazdaFactory();
            default:
                throw new IllegalArgumentException("Marca no soportada.");
        }
    }
}
