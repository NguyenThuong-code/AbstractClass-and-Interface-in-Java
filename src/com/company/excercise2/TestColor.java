package com.company.excercise2;

public class TestColor {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(),new Rectangle()};
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Colorable){
                Colorable colorable=(Colorable) shape;
                colorable.howToColor();
            }
        }
    }
}
