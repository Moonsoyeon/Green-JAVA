import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.printf("정수를 입력하시오 : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for (int i=1;i<=n;i++)
			fact = fact * i;
		
		System.out.printf("%d!은 %d입니다.\n", n, fact);
		
	}
	
}