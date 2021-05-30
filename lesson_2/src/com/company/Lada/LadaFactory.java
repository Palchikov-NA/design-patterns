package com.company.Lada;

import com.company.Bodywork;
import com.company.CarFactory;
import com.company.Motor;
import com.company.Salon;

public class LadaFactory implements CarFactory {
    @Override
    public Bodywork createBodywork() {
        return new LadaBodywork();
    }

    @Override
    public Motor createMotor() {
        return new LadaMotor();
    }

    @Override
    public Salon createSalon() {
        return new LadaSalon();
    }
}
