package com.example.CarParts.ClassConcrete.Mazda;

import com.example.CarParts.Interface.IMotor;

public class MazdaMotor implements IMotor {
    @Override
    public int getPotenciaMaxima() { return 180; }
    @Override
    public String getNumeroPieza() { return "MM123"; }
    @Override
    public String getTecnologia() { return "Termico"; }
}
