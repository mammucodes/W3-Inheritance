package com.w3.inhertiancemainTest;

import com.w3.shape.Rectangle;
import com.w3.shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleShapeTest {
    @Test
    public void rectangleGetAreaTest(){
        double length = 2.5;
        double width = 3.5;
       double excepted = 8.75;
       Rectangle r = new Rectangle(length,width);
       double  result =  r.getArea();
        Assertions.assertEquals(excepted,result);

        Shape s = new Rectangle(length,width);
        double  res =  r.getArea();
        Assertions.assertEquals(excepted,res);
    }
    @Test
    public  void shapeGetAreaTest(){

        double length = 2.5;
        double width = 3.5;
        double excepted =0.0;
        Shape s = new Shape();
        double result = s.getArea();
        Assertions.assertEquals(excepted,result);

    }
}
