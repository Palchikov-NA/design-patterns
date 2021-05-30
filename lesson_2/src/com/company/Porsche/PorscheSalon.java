package com.company.Porsche;

import com.company.Salon;

public class PorscheSalon implements Salon {

    @Override
    public String getColor() {
        return "Цвет белый";
    }

    @Override
    public String getMaterial() {
        return "Материал: кожаный";
    }
}
