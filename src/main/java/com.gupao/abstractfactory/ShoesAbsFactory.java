package com.gupao.abstractfactory;

import com.gupao.Shores;

public interface ShoesAbsFactory {

/**
 * 制作鞋盒
 */
ShoesBox makeShoeBox();
/**
 * 制作鞋底
 */

Sole makeSole();

}
