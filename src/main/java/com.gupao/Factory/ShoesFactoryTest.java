package com.gupao.Factory;

import com.gupao.Shores;

public class ShoesFactoryTest {


    public static void main(String[] args) {
        GymShoesFactory gymShoesFactory = new GymShoesFactory();
        Shores creat = gymShoesFactory.creat();
        creat.makeShoures();


        CanvasShoesFactory canvasShoesFactory = new CanvasShoesFactory();
        Shores creat1 = canvasShoesFactory.creat();
        creat1.makeShoures();


    }
}
