package com.pjseok.getset;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
//		student.name = "홍길동";
//		student.age = 17;
//		student.grade = 3;
//		student.address = "서울특별시 은평구";
//		
//		student.age = 27;
		student.setName("홍길동");
		student.setAge(35);
		
		System.out.println(student.getName());
		
		Member member = new Member();
		
		member.setMemberName("이순신");
		System.out.println(member.getMemberName());
		
		
	}

}
