/*
	고양이 Cat : class
	이름 name : String
	나이 age : int
	색깔 color : String
	냐옹 void
	인사하기 sayHello() : void
	자기소개하기 introduceSelf() : void
	점수(합계, 평균) 자랑하기 showScore() : void
*/
class Cat{
	String name;
	int age;
	String color;
	void meow() {
		System.out.println("냐옹이");
	}
	void print() {
		System.out.println("이름 : " + name + "나이 : " + age + "색깔 : " + color);
	}
	void sayHello() {
		System.out.println("안녕하숑");
	}
	void introduceSelf() {
		System.out.println("저의 이름은 " + name + "이고, 나이는 " + age + "입니다."); 
	}
}

class CatTest{
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.name = "소연";
		c1.age = 21;
		c1.color = "노란색";
		
		c1.introduceSelf();
		c1.meow();
		c1.sayHello();
		
		Cat c2 = new Cat();
		c2.name = "세준";
		c2.age = 25;
		c2.color = "검은색";
		
		c2.introduceSelf();
		c2.meow();
		c2.sayHello();
	}
	
}