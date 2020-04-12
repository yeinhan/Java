package com.silsub1.book.model.vo;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "책 제목:"+title+"	저자명:"+author+"	가격:"+price;
	}
	
	//2. equals()	
	//두 객체의 주소값을 비교하여 같으면 true, 다르면 false
	//객체가 가진 값까지 비교하기 위한 목적으로 오버라이딩, 동등성 확보
	@Override
	public boolean equals(Object obj) {
		//주소가 같으면 같은 객체
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		//전달받은 객체를 형변환 하여 각 필드별로 비교 시작
		Book other = (Book) obj;
		
		if(title == null) {
			if(other.title != null) {
				return false;
			}
		}else if(!title.equals(other.title)) {
			return false;
		}
		if(author == null) {
			if(other.title == null) {
				return false;
			}
		}else if(!title.equals(other.title)) {
			return false;
		}
		//기본자료형의 경우 값만 일치하는지 비교
		if(price != other.price) {
			return false;
		}
		return true;
		
		
	}
	
	@Override
	public int hashCode() {
		
		return (author+price+title).hashCode();
	}
}
