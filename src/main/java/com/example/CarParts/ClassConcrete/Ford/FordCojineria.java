package com.example.CarParts.ClassConcrete.Ford;
import com.example.CarParts.Interface.ICojin;

public class FordCojineria implements ICojin {
    @Override
    public String getNumeroPieza() { return "FC123"; }
    @Override
    public String getMaterialBase() { return "Tela"; }
}
