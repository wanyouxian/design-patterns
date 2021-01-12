package com.rocky.patterns.factory;
import com.rocky.patterns.factory.impl.Shape;
import org.apache.commons.lang.StringUtils;



/**
 * @ClassName : ShapeFactory
 * @Author : Rocky
 * @Date: 2021-01-12 17:37
 * @Email: wanyouxian@sina.com
 * @Description : TODO
 * @Version : 1.0
 */
public class ShapeFactory {

  public Shape getShape(String shapeType)
  {
    if (StringUtils.isEmpty(shapeType))
      return null;
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new CircleShape();
    } else if (shapeType.equalsIgnoreCase("RECTANGLE"))
    {
      return new RectangleShape();
    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new SquareShape();

    }
    return null;
  }

}
