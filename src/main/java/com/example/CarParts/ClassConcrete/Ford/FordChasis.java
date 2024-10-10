package com.example.CarParts.ClassConcrete.Ford;
import com.example.CarParts.Interface.IChasis;

public class FordChasis implements IChasis {
    @Override
    public int getNumeroEjes() { return 2; }
    @Override
    public String getNumeroPieza() { return "FCH123"; }
    @Override
    public String getTipoTransmision() { return "Mecánica"; }
}
