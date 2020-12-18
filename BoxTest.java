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
		
		System.out.println("박스의 가로 : " + myBox.width
						+ "\n박스의 세로 : " + myBox.length
						+ "\n박스의 높이 : " + myBox.height);
		
	}
}