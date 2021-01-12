package com.rocky.patterns.factory;

import com.rocky.patterns.factory.impl.Shape;

/**
 * @ClassName : CircleShape
 * @Author : Rocky
 * @Date: 2021-01-12 17:35
 * @Email: wanyouxian@sina.com
 * @Description : TODO
 * @Version : 1.0
 */
public class CircleShape implements Shape {

  public void draw() {
    System.out.println("Inside CircleShape::draw() method.");
  }


}
