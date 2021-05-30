package com.company.BMW;

import com.company.Salon;

public class BMWSalon implements Salon {
    @Override
    public String getColor() {
        return "Цвет: чёрный";
    }

    @Override
    public String getMaterial() {
        return "Материал: кож.зам";
    }
}
