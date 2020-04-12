package com.silsub2.point.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.printf("X:%d Y:%d 사각형의 둘레는:%d\t",super.getX(),super.getY(),2*(getWidth()+getHeight()));
		System.out.printf("원의 면적은: %d\n",(getWidth()*getHeight()));
	}
}
