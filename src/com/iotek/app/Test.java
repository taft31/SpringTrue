package com.iotek.app;

import static org.junit.Assert.assertEquals;

/**
 * Created by taft on 2016/10/22.
 */
public class Test {
    @org.junit.Test
    public void testAdd(){
        Calc calc = new Calc();

        int result = calc.add(10,20);

        assertEquals("加法有问题:",result,30);
    }
}
