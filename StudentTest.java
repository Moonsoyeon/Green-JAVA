/*
	�л� Student class
	�̸� name string
	���� age int
	�������� kor int
	�������� eng int
	�������� math int
	
	�λ��ϱ� sayHello() : void
	�ڱ�Ұ��ϱ� introduceSelf() : void
	����(�հ�, ���) �ڶ��ϱ� showScore() : void
*/

class Student{
	String name;
	int age;
	int kor;
	int eng;
	int math;
	void print() {
		System.out.println("�̸� : " + name + " ���� : " + age + " ���� ���� : " + kor + " ���� ���� : " + eng + " ���� ���� : " + math);
	}
	void sayHello() {
		System.out.println("�ȳ��ϼ�");
	}
	void introduceSelf() {
		System.out.println("���� �̸��� " + name + "�̰�, ���̴� " + age + "�Դϴ�."); 
	}
}

public class StudentTest{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "���ҿ�";
		s1.age = 21;
		s1.kor = 100;
		s1.eng = 99;
		s1.math = 98;
		
		System.out.println(s1.name);
		s1.sayHello();
		s1.introduceSelf();
		
		Student s2 = new Student();
		s2.name = "�谡��";
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