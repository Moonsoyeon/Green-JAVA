/*
	학생 Student class
	이름 name string
	나이 age int
	국어점수 kor int
	영어점수 eng int
	수학점수 math int
	
	인사하기 sayHello() : void
	자기소개하기 introduceSelf() : void
	점수(합계, 평균) 자랑하기 showScore() : void
*/

class Student{
	String name;
	int age;
	int kor;
	int eng;
	int math;
	void print() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 국어 점수 : " + kor + " 영어 점수 : " + eng + " 수학 점수 : " + math);
	}
	void sayHello() {
		System.out.println("안녕하숑");
	}
	void introduceSelf() {
		System.out.println("저의 이름은 " + name + "이고, 나이는 " + age + "입니다."); 
	}
}

public class StudentTest{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "문소연";
		s1.age = 21;
		s1.kor = 100;
		s1.eng = 99;
		s1.math = 98;
		
		System.out.println(s1.name);
		s1.sayHello();
		s1.introduceSelf();
		
		Student s2 = new Student();
		s2.name = "김가희";
		s2.age = 21;
		s2.kor = 50;
		s2.eng = 49;
		s2.math = 48;
		
		System.out.println(s2.name);
		s2.sayHello();
		s2.introduceSelf();
		s2.print();
		
	}
}