import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("500원 개수 : ");
		int fiveh = input.nextInt();
		System.out.println("100원 개수 : ");
		int oneh = input.nextInt();
		System.out.println("50원 개수 : ");
		int five = input.nextInt();
		System.out.println("10원 개수 : ");
		int one = input.nextInt();
		
		int sum = fiveh*500 + oneh*100 + five*50 + one*10;
		System.out.println("합계는"+sum+"원 입니다.");
	}
}
	