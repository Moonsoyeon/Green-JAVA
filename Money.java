import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("500�� ���� : ");
		int fiveh = input.nextInt();
		System.out.println("100�� ���� : ");
		int oneh = input.nextInt();
		System.out.println("50�� ���� : ");
		int five = input.nextInt();
		System.out.println("10�� ���� : ");
		int one = input.nextInt();
		
		int sum = fiveh*500 + oneh*100 + five*50 + one*10;
		System.out.println("�հ��"+sum+"�� �Դϴ�.");
	}
}
	