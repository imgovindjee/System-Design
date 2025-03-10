package com.AA.AllPattern.CreationalDesignPattern.Factory.ShapeFactoryImplementation;

import com.AA.AllPattern.CreationalDesignPattern.Factory.ShapeFactory.Circle;
import com.AA.AllPattern.CreationalDesignPattern.Factory.ShapeFactory.Rectangle;
import com.AA.AllPattern.CreationalDesignPattern.Factory.ShapeFactory.Shape;
import com.AA.AllPattern.CreationalDesignPattern.Factory.ShapeFactory.Square;

public class ShapeFactoryInstance {
    public Shape getShapeFactoryInstance(String value) {
        if(value.equals("CIRCLE")) {
            return new Circle();
        } else if(value.equals("SQUARE")) {
            return new Square();
        } else if(value.equals("RECTANGLE")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
