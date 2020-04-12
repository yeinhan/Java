package silsub3.run;


import silsub3.model.vo.Circle;
//객체 실습문제3
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle one = new Circle();
		
		System.out.println("원의 반지름:"+one.getRadius()+" 둘레:"+(one.getPI()*one.getRadius()*2)+
				" 넓이:"+(one.getRadius()*one.getRadius())*one.getPI());
		
		one.incrementRadius();
	}

}
