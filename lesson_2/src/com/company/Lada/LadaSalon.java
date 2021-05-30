package com.company.Lada;

import com.company.Salon;

public class LadaSalon implements Salon {
    @Override
    public String getColor() {
        return "Цвет: синий";
    }

    @Override
    public String getMaterial() {
        return "Материал: Алькантара";
    }
}
