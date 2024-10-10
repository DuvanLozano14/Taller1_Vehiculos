package com.example.CarParts.ClassConcrete.Toyota;

import com.example.CarParts.Interface.IChasis;

public class ToyotaChasis implements IChasis {
    @Override
    public int getNumeroEjes() { return 2; }
    @Override
    public String getNumeroPieza() { return "TCH123"; }
    @Override
    public String getTipoTransmision() { return "Automática"; }
}
