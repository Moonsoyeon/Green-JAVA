import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.printf("������ �Է��Ͻÿ� : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for (int i=1;i<=n;i++)
			fact = fact * i;
		
		System.out.printf("%d!�� %d�Դϴ�.\n", n, fact);
		
	}
	
}