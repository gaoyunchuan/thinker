package com.github.gaoyunchuan.thinker.practice.spi;

/**
 * Created by gaoyunchuan on 16/6/3.
 */
public class ZhangSpi implements Spi {
    public void sayHello() {
        System.out.println("say Hello:" + this.getClass().getName());
    }
}
