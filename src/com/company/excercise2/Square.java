package com.company.excercise2;



public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double height){
        setSide(height);
    }

    @Override
    public String toString(){
        return "A square with side="
                + getSide()
                +", which is a subclass of"
                + super.toString();
    }


}
