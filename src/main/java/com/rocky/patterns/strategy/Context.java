package com.rocky.patterns.strategy;

import com.rocky.patterns.strategy.impl.Strategy;

/**
 * @ClassName : Context
 * @Author : Rocky
 * @Date: 2021-01-12 17:06
 * @Email: wanyouxian@sina.com
 * @Description : TODO
 * @Version : 1.0
 */
public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public Integer executeStrategy(Integer num1, Integer num2)
  {
    return strategy.doOperation(num1, num2);
  }
}
