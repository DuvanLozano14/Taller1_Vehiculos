package com.example.CarParts.Factory;

import com.example.CarParts.Interface.IChasis;
import com.example.CarParts.Interface.ICojin;
import com.example.CarParts.Interface.IMotor;
import com.example.CarParts.Interface.IVehiculoAbstractFactory;
import com.example.CarParts.ClassConcrete.Mazda.*;

public class MazdaFactory implements IVehiculoAbstractFactory {
    @Override
    public IChasis crearChasis() { return new MazdaChasis(); }
    @Override
    public IMotor crearMotor() { return new MazdaMotor(); }
    @Override
    public ICojin crearCojineria() { return new MazdaCojineria(); }
}
