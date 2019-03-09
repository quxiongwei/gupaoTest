package com.gupao.Simple;

import com.gupao.Shores;

public class SimpleFatory {

    public Shores creat(Class<? extends Shores>clazz ) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;

    }

}
