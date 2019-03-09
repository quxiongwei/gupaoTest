package com.gupao.Factory;

import com.gupao.LeatherShoes;
import com.gupao.Shores;

public class LeatherShoesFactory implements ShoresFactory {

    public Shores creat() {
        return new LeatherShoes();
    }
}
