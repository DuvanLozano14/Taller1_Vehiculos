package com.example.CarParts.ClassConcrete.Mazda;

import com.example.CarParts.Interface.IChasis;

public class MazdaChasis implements IChasis {
    @Override
    public int getNumeroEjes() { return 2; }
    @Override
    public String getNumeroPieza() { return "MCH123"; }
    @Override
    public String getTipoTransmision() { return "Automática"; }
}
