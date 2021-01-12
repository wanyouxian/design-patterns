package com.rocky.patterns.factory;

import com.rocky.patterns.factory.impl.Shape;

/**
 * @ClassName : SquareShape
 * @Author : Rocky
 * @Date: 2021-01-12 17:37
 * @Email: wanyouxian@sina.com
 * @Description : TODO
 * @Version : 1.0
 */
public class SquareShape implements Shape {

  public void draw() {
    System.out.println("Inside SquareShape::draw() method.");
  }
}
