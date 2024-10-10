package com.example.CarParts.ClassConcrete.Toyota;

import com.example.CarParts.Interface.IMotor;

public class ToyotaMotor implements IMotor {
    @Override
    public int getPotenciaMaxima() { return 180; }
    @Override
    public String getNumeroPieza() { return "TM123"; }
    @Override
    public String getTecnologia() { return "Híbrido"; }
}
