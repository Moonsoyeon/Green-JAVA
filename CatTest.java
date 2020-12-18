/*
	����� Cat : class
	�̸� name : String
	���� age : int
	���� color : String
	�Ŀ� void
	�λ��ϱ� sayHello() : void
	�ڱ�Ұ��ϱ� introduceSelf() : void
	����(�հ�, ���) �ڶ��ϱ� showScore() : void
*/
class Cat{
	String name;
	int age;
	String color;
	void meow() {
		System.out.println("�Ŀ���");
	}
	void print() {
		System.out.println("�̸� : " + name + "���� : " + age + "���� : " + color);
	}
	void sayHello() {
		System.out.println("�ȳ��ϼ�");
	}
	void introduceSelf() {
		System.out.println("���� �̸��� " + name + "�̰�, ���̴� " + age + "�Դϴ�."); 
	}
}

class CatTest{
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.name = "�ҿ�";
		c1.age = 21;
		c1.color = "�����";
		
		c1.introduceSelf();
		c1.meow();
		c1.sayHello();
		
		Cat c2 = new Cat();
		c2.name = "����";
		c2.age = 25;
		c2.color = "������";
		
		c2.introduceSelf();
		c2.meow();
		c2.sayHello();
	}
	
}