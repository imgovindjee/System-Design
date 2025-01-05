package com.AA.AllPattern.CreationalDesignPattern.Factory;

import com.AA.AllPattern.CreationalDesignPattern.Factory.ShapeFactory.Shape;
import com.AA.AllPattern.CreationalDesignPattern.Factory.ShapeFactoryImplementation.ShapeFactoryInstance;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryInstance shapeFactoryInstanceObj = new ShapeFactoryInstance();

        Shape circleObj = shapeFactoryInstanceObj.getShapeFactoryInstance("CIRCLE");
        circleObj.computeArea();

        Shape squareObj = shapeFactoryInstanceObj.getShapeFactoryInstance("SQUARE");
        squareObj.computeArea();

//        Shape rectangleObj = shapeFactoryInstanceObj.getShapeFactoryInstance("RECTANGLE");
        shapeFactoryInstanceObj.getShapeFactoryInstance("RECTANGLE").computeArea();

        shapeFactoryInstanceObj.getShapeFactoryInstance("").computeArea();
    }
}
