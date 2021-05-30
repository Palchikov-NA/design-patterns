package com.company.Porsche;

import com.company.Motor;

public class PorscheMotor implements Motor {

    @Override
    public String getPower() {
        return "Мощность: 700 л.с.";
    }

    @Override
    public String getFuel() {
        return "Типо топлива: Электричество";
    }
}
