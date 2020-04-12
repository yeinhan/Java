package silsub1.run;

import silsub1.model.vo.Member;

//객체 실습문제1
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Member meb = new Member();
	
	meb.setMemberId("goregore8637");
	meb.setMemberPwd("1234");
	meb.setMemberName("한예인");
	meb.setAge(20);
	meb.setGender('F');
	meb.setPhone("010-1234-1234");
	meb.setEmail("goregore8637@naver.com");
	
	System.out.println("아이디: "+meb.getMemberId());
	System.out.println("비밀번호: "+meb.getMemberPwd());
	System.out.println("이름: "+meb.getMemberName());
	System.out.println("나이: "+meb.getAge());
	System.out.println("성별: "+meb.getGender());
	System.out.println("전화번호: "+meb.getPhone());
	System.out.println("이메일: "+meb.getEmail());
	
	}

}
