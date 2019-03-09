package com.gupao.abstractfactory;



public class GymShoesFactory implements ShoesAbsFactory {
    @Override
    public ShoesBox makeShoeBox() {
        return new GymShoesBox();
    }

    @Override
    public Sole makeSole() {
        return new GymSole();
    }
}
