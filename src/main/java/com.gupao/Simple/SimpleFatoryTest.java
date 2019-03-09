package com.gupao.Simple;

import com.gupao.GymShoes;
import com.gupao.Shores;

public class SimpleFatoryTest {

    public static void main(String[] args) {
        SimpleFatory simpleFatory = new SimpleFatory();
        Shores creat = simpleFatory.creat(GymShoes.class);
        creat.makeShoures();
    }
}
