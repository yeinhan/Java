package com.poly.silsub1.shape.model.vo;

public class Circle implements IShape {
	private double radius;
	final double PI = Math.PI;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		double sum = getRadius()*getRadius()*PI;
		return sum;
	}

	@Override
	public double perimeter() {
		double sum =(getRadius()*PI*2);
		return sum;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
