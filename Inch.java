import java.util.Scanner;

public class Inch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("키를 입력하시오 : ");
		int cm = input.nextInt();
		
		double inch = cm / 2.54;
		int feet = (int)(inch / 12);
		System.out.println(cm + "cm는 " + feet + "피트 " + inch % 12 + "인치입니다");
	}
}