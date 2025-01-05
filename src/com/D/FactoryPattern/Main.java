package com.D.FactoryPattern;

import com.D.FactoryPattern.Factory.Shape;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

//      THROWS NPE(NULL POINTER EXCEPTION)
//        Shape shape3 = shapeFactory.getShape("");
//        shape3.draw();
    }
}
