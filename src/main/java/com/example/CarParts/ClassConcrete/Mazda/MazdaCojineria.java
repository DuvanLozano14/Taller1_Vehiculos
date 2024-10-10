package com.example.CarParts.ClassConcrete.Mazda;

import com.example.CarParts.Interface.ICojin;

public class MazdaCojineria implements ICojin {
    @Override
    public String getNumeroPieza() { return "MC123"; }
    @Override
    public String getMaterialBase() { return "Sintetico"; }
}
