package com.company.Lada;

import com.company.Motor;

public class LadaMotor implements Motor {
    @Override
    public String getPower() {
        return "Мощность: 300 л.с.";
    }

    @Override
    public String getFuel() {
        return "Типо топлива: Дизельный";
    }
}
