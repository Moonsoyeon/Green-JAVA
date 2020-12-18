import java.util.*;

public class baesu{
	public static void main(String[] args) {
		
		System.out.println("Á¤¼ö : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=0;
		int i=1;
		while(i<=100){
			if(i%n==0){
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
	
}