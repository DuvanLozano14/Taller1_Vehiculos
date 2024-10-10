package com.example.CarParts.ClassConcrete.Toyota;

import com.example.CarParts.Interface.ICojin;

public class ToyotaCojineria implements ICojin {
    @Override
    public String getNumeroPieza() { return "TC123"; }
    @Override
    public String getMaterialBase() { return "Cuero"; }
}
