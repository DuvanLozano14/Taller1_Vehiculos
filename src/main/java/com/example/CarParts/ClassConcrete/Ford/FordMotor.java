package com.example.CarParts.ClassConcrete.Ford;
import com.example.CarParts.Interface.IMotor;

public class FordMotor implements IMotor {
    @Override
    public int getPotenciaMaxima() { return 180; }
    @Override
    public String getNumeroPieza() { return "FM123"; }
    @Override
    public String getTecnologia() { return "Electrico"; }
}
