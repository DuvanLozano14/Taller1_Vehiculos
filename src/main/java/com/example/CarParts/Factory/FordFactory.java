package com.example.CarParts.Factory;

import com.example.CarParts.ClassConcrete.Ford.*;
import com.example.CarParts.Interface.IChasis;
import com.example.CarParts.Interface.ICojin;
import com.example.CarParts.Interface.IMotor;
import com.example.CarParts.Interface.IVehiculoAbstractFactory;

public class FordFactory implements IVehiculoAbstractFactory {
    @Override
    public IChasis crearChasis() { return new FordChasis(); }
    @Override
    public IMotor crearMotor() { return new FordMotor(); }
    @Override
    public ICojin crearCojineria() { return new FordCojineria(); }
}
