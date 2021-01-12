package com.rocky.patterns.factory;

import com.rocky.patterns.factory.impl.Shape;

/**
 * @ClassName : RectangleShape
 * @Author : Rocky
 * @Date: 2021-01-12 17:36
 * @Email: wanyouxian@sina.com
 * @Description : TODO
 * @Version : 1.0
 */
public class RectangleShape implements Shape {

  public void draw() {
    System.out.println("Inside RectangleShape::draw() method.");
  }
}
