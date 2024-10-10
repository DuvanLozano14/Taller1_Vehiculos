package com.example.CarParts.Interface;

public interface IVehiculoAbstractFactory {
    IChasis crearChasis();
    IMotor crearMotor();
    ICojin crearCojineria();
}
