package com.silsub2.point;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1[] = {
				new Circle(0,0,2),
				new Circle(0,0,3),
				new Circle(0,0,4),
		};
		
		Rectangle r1[] = {
				 new Rectangle(0,0,5,5),
				 new Rectangle(0,0,6,6),
				 new Rectangle(1,1,6,6)
		};
		
		for(int i=0; i<c1.length; i++) {
			c1[i].draw();
		}
		
		for(int i=0; i<r1.length; i++) {
			r1[i].draw();
		}
		
	}

}
