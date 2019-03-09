package com.gupao.Factory;

import com.gupao.GymShoes;
import com.gupao.Shores;

public class GymShoesFactory implements ShoresFactory{

    public Shores creat() {
        return new GymShoes();
    }
}
