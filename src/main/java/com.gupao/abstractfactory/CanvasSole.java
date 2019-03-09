package com.gupao.abstractfactory;

public class CanvasSole implements Sole{
    @Override
    public void makeSole() {
        System.out.println("制作帆布鞋鞋底");
    }
}
