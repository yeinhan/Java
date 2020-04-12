package com.silsub2.point.model.vo;

public class Circle extends Point{
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() { 
		System.out.printf("x:%d y:%d 원의 둘레:%.2f\t",super.getX(),super.getY(),Math.PI*radius*2);
		System.out.println("원의 넓이:"+(int)(Math.PI*radius*radius)*10/10.0);
	}

}
