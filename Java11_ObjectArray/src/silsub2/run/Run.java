package silsub2.run;

import silsub2.model.vo.Product;

//객체 실습문제2
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prd = new Product();
		
		prd.setPName("아이폰");
		prd.setBrand("애플");
		prd.setPrice(1200000);
		
		System.out.println(prd.info());
	}

}
