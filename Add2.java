// 사용자가 입력한 두 개의 숫자를 더해서 출력한다.
import java.util.Scanner; // Scanner 클래스 포함

public class Add2 {
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.println("첫 번째 숫자를 입력하시오 : ");
		x = input.nextInt();
		
		System.out.println("두 번재 숫자를 입력하시오 : ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
	}
}