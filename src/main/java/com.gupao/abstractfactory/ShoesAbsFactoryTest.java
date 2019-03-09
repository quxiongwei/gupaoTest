package com.gupao.abstractfactory;

public class ShoesAbsFactoryTest {
    public static void main(String[] args) {
        GymShoesFactory gymShoesFactory = new GymShoesFactory();
        gymShoesFactory.makeShoeBox().makeBox();
        gymShoesFactory.makeSole().makeSole();


        CanvasShoesFactory canvasShoesFactory = new CanvasShoesFactory();
        canvasShoesFactory.makeShoeBox().makeBox();
        canvasShoesFactory.makeSole().makeSole();
    }
}
