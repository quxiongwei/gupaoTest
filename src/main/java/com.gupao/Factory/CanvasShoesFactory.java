package com.gupao.Factory;

import com.gupao.CanvasShoes;
import com.gupao.Shores;

public class CanvasShoesFactory implements ShoresFactory{

    public Shores creat() {
        return new CanvasShoes();
    }
}
