package com.gupao.abstractfactory;

import com.gupao.CanvasShoes;
import com.gupao.Shores;

public class CanvasShoesFactory implements ShoesAbsFactory{

    public ShoesBox makeShoeBox() {
        return new CanvasShoesBox();
    }


    public Sole makeSole() {
        return new CanvasSole();
    }
}
