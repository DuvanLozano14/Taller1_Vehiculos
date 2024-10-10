package com.example.CarParts.Factory;

import com.example.CarParts.Interface.IChasis;
import com.example.CarParts.Interface.ICojin;
import com.example.CarParts.Interface.IMotor;
import com.example.CarParts.Interface.IVehiculoAbstractFactory;
import com.example.CarParts.ClassConcrete.Toyota.*;

public class ToyotaFactory implements IVehiculoAbstractFactory {
    @Override
    public IChasis crearChasis() { return new ToyotaChasis(); }
    @Override
    public IMotor crearMotor() { return new ToyotaMotor(); }
    @Override
    public ICojin crearCojineria() { return new ToyotaCojineria(); }
}
