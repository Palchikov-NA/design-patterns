package com.company.Porsche;

import com.company.Bodywork;
import com.company.CarFactory;
import com.company.Motor;
import com.company.Salon;

public class PorscheFactory implements CarFactory {
    @Override
    public Bodywork createBodywork() {
        return new PorscheBodywork();
    }

    @Override
    public Motor createMotor() {
        return new PorscheMotor();
    }

    @Override
    public Salon createSalon() {
        return new PorscheSalon();
    }
}
