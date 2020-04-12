package com.poly.silsub1.shape.model.vo;

public class Triangle implements IShape {

	private double base;
	private double height;
	//�⺻ ������
	public Triangle() {}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	@Override
	public double area() {
		double result = (getBase()*getHeight())/2;
		return result;
	}

	public double getHypotenuse() {
		double result = Math.sqrt(getBase()*getBase()+getHeight()*getHeight());
		return result;
	}
	@Override
	public double perimeter() {
		double result = getBase()+getHeight()+getHypotenuse();
		return result;
	}
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
