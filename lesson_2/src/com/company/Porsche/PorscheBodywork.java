package com.company.Porsche;

import com.company.Bodywork;

public class PorscheBodywork  implements Bodywork {
    @Override
    public String getColor() {
        return "Цвет: белый";
    }

    @Override
    public String getView() {
        return "Тип: седан";

    }
}
