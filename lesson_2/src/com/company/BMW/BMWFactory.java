package com.company.BMW;

import com.company.Bodywork;
import com.company.CarFactory;
import com.company.Motor;
import com.company.Salon;

public class BMWFactory implements CarFactory {
    @Override
    public Bodywork createBodywork() {
        return new BMWBodywork();
    }

    @Override
    public Motor createMotor() {
        return new BMWMotor();
    }

    @Override
    public Salon createSalon() {
        return new BMWSalon();
    }
}
