package com.company.BMW;

import com.company.Bodywork;

public class BMWBodywork  implements Bodywork {
    @Override
    public String getColor() {
        return "Цвет: чёрный";
    }

    @Override
    public String getView() {
        return "Тип: седан";

    }
}
