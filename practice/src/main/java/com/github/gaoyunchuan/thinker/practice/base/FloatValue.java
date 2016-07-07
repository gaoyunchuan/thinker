package com.github.gaoyunchuan.thinker.practice.base;

import java.math.BigDecimal;

/**
 * Created by gaoyunchuan on 16/6/28.
 */
public class FloatValue {

    public static int convert(BigDecimal old){
        return (old.multiply(new BigDecimal(100))).intValue();
    }

    public static void main(String[] args) {
        System.out.println(new BigDecimal(9.9).floatValue() * 100);
        System.out.println(FloatValue.convert(new BigDecimal(9.9)));
    }
}
