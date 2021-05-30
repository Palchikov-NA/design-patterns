package com.company;

import com.company.BMW.BMWFactory;
import com.company.Lada.LadaFactory;
import com.company.Porsche.PorscheFactory;

public class Main {

    public static void main(String[] args) {

//        CarFactory car = new BMWFactory();
        CarFactory car = new LadaFactory();
//        CarFactory car = new PorscheFactory();

        printIndicatorCar(car);

    }

    public static void printIndicatorCar(CarFactory car){
        System.out.println("==== Показатели машины ======\n");

        Bodywork bodywork = car.createBodywork();
        System.out.println("Кузов\n  " + bodywork.getColor() + "\n  " + bodywork.getView() );

        Motor motor = car.createMotor();
        System.out.println("Мотор\n  " + motor.getPower() + "\n  " + motor.getFuel());

        Salon salon = car.createSalon();
        System.out.println("Салон\n  " + salon.getColor() + "\n  " + salon.getMaterial());


    }
}
