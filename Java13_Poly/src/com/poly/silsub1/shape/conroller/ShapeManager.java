package com.poly.silsub1.shape.conroller;

import com.poly.silsub1.shape.model.vo.Circle;
import com.poly.silsub1.shape.model.vo.IShape;
import com.poly.silsub1.shape.model.vo.Rectangle;
import com.poly.silsub1.shape.model.vo.Shape;

public class ShapeManager {
//	public void calcShape() {
//		Shape s;
//	
//		s= new Circle(15.5);
//		
//		System.out.println("원 면적: " +s.area());
//		System.out.println("원 둘레: "+s.perimeter());
//		
//		s= new Rectangle(34.5, 42.7);
//		
//		System.out.println("사각형 면적: "+s.area());
//		System.out.println("사각형 둘레: "+s.perimeter());
//	
//	}
	public void TestIShape() {
		IShape s;
		
		s= new Circle(15.5);
		
		System.out.println("원 면적: " +s.area());
		System.out.println("원 둘레: "+s.perimeter());
		
		s= new Rectangle(34.5, 42.7);
		
		System.out.println("사각형 면적: "+s.area());
		System.out.println("사각형 둘레: "+s.perimeter());
	}
	
}
