class Box {
	int width;
	int length;
	int height;
}

public class BoxTest {
	public static void main(String[] args){
		Box myBox = new Box();
		myBox.width = 100;
		myBox.length = 200;
		myBox.height = 300;
		
		System.out.println("�ڽ��� ���� : " + myBox.width
						+ "\n�ڽ��� ���� : " + myBox.length
						+ "\n�ڽ��� ���� : " + myBox.height);
		
	}
}