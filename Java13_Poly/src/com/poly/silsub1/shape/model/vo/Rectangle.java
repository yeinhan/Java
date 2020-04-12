package com.poly.silsub1.shape.model.vo;

public class Rectangle implements IShape{
	private double width;
	private double height;
	
	public Rectangle() {}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		double sum1 = (getWidth()*getHeight());
		return sum1;
	}

	@Override
	public double perimeter() {
		double sum2 = (getWidth()+getHeight())*2;
		return sum2;
	}

	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
