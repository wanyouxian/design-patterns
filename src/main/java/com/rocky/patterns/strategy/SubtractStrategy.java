package com.rocky.patterns.strategy;

import com.rocky.patterns.strategy.impl.Strategy;

/**
 * @ClassName : SubtractStrategy
 * @Author : Rocky
 * @Date: 2021-01-12 17:04
 * @Email: wanyouxian@sina.com
 * @Description : TODO
 * @Version : 1.0
 */
public class SubtractStrategy implements Strategy {


  public Integer doOperation(Integer num1, Integer num2) {
    return num1 - num2;
  }
}
