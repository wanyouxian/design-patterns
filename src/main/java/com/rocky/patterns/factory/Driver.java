package com.rocky.patterns.factory;

/**
 * @ClassName : Driver
 * @Author : Rocky
 * @Date: 2021-01-12 17:45
 * @Email: wanyouxian@sina.com
 * @Description : TODO
 * @Version : 1.0
 */
public class Driver {

  public static void main(String[] args) {
    new ShapeFactory().getShape("circle").draw();
    new ShapeFactory().getShape("rectangle").draw();
    new ShapeFactory().getShape("square").draw();

  }

}
