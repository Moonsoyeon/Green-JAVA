import java.util.Scanner;

public class bbbung {
	public static void main(String[] args) {
		
		
		System.out.println("n? ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = n;
		while (m<=100){
			System.out.println(m);
			m += n; 
		}		
		
	}
	
}