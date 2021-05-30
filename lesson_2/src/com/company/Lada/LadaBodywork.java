package com.company.Lada;

import com.company.Bodywork;

public class LadaBodywork  implements Bodywork {
    @Override
    public String getColor() {
        return "Цвет: вишнёвый";
    }

    @Override
    public String getView() {
        return "Тип: хетчбек";

    }
}
