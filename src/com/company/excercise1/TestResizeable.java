package com.company.excercise1;

import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {

Shape[] shapes= {new Circle(),new Rectangle(), new Square() };
for (Shape shape: shapes){
    System.out.println(shape.getArea());
    int Random = (int)(Math.random()*100);
   shape.resize(Random);
    System.out.println(shape.getArea());
}
    }
}
