package silsub2.model.vo;

//객체 실습문제2
public class Product {
	private String pName, brand;
	private int price;
	
	
	public Product() {}
	
	
	public String getPName() {
		return pName;
	}
	public void setPName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String info() {
		return pName+"는 "+brand+"브랜드 이고 가격은"+price+"원 이다.";
	}
}
