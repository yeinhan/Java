package silsub3.model.vo;

//객체 실습문제3
public class Circle {
	public double PI = 3.14;
	private int radius=3;
	
	public Circle() {}
	
	
	public double getPI() {
		return PI;
	}
	public void setPI(double PI) {
		this.PI = PI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius= radius;
	}
	
	public void incrementRadius() {
		radius +=1;
		System.out.println("원의 반지름:"+radius+" 둘레:"+(2*PI*radius)+" 넓이:"+(PI*(radius*radius)));
	}
}
