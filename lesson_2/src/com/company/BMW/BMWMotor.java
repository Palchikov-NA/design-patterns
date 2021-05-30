package com.company.BMW;

import com.company.Motor;

public class BMWMotor implements Motor {
    @Override
    public String getPower() {
        return "Мощность: 500 л.с.";
    }

    @Override
    public String getFuel() {
        return "Типо топлива: Бензин";
    }
}
