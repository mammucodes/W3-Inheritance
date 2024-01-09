package com.w3.shape;

public class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public  double getArea(){
        double area = this.length*this.width;
        return area;
    }
}
