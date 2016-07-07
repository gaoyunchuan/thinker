package com.github.gaoyunchuan.thinker.practice.spi;

import org.junit.Test;

import java.util.ServiceLoader;

/**
 * Created by gaoyunchuan on 16/6/3.
 */
public class SpiTest{

    @Test
    public void sayHelloTest(){
        ServiceLoader<Spi> spi = ServiceLoader.load(Spi.class);
        for (Spi item : spi){
            item.sayHello();
        }
        //console:
        //say Hello:com.github.gaoyunchuan.thinker.spi.ZhangSpi
        //say Hello:com.github.gaoyunchuan.thinker.spi.MaSpi
    }
}
