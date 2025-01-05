package com.D.FactoryPattern;

import com.D.FactoryPattern.Factory.Circle;
import com.D.FactoryPattern.Factory.Rectangle;
import com.D.FactoryPattern.Factory.Shape;

public class ShapeFactory {
    public Shape getShape(String str){
        return switch (str) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
