import java.util.Scanner;

public class Inch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��Ͻÿ� : ");
		int cm = input.nextInt();
		
		double inch = cm / 2.54;
		int feet = (int)(inch / 12);
		System.out.println(cm + "cm�� " + feet + "��Ʈ " + inch % 12 + "��ġ�Դϴ�");
	}
}