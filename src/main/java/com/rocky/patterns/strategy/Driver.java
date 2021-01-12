package com.rocky.patterns.strategy;

/**
 * @ClassName : Driver
 * @Author : Rocky
 * @Date: 2021-01-12 17:06
 * @Email: wanyouxian@sina.com
 * @Description : TODO
 * @Version : 1.0
 */
public class Driver {

  public static void main(String[] args) {

    Context addContext = new Context(new AddOperation());
    System.out.println("10 + 5 = " + addContext.executeStrategy(10, 5));

    Context substractContext = new Context(new SubtractStrategy());
    System.out.println("10 - 5 = " + substractContext.executeStrategy(10, 5));

    Context multipyContext = new Context(new MultiplyStrategy());
    System.out.println("10 * 5 = " + multipyContext.executeStrategy(10, 5));
  }
}
