import java.util.*;

public class LoopExample2 {
	public static void main(String[] args){
		int n;
		int i = 1;
		System.out.println("±¸±¸´Ü? ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		while (i <= 9) {
			System.out.println(n + "*" + i + " = " + (n*i));
			i++;
		}
		
	}
	
}