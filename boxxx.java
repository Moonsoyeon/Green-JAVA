import java.util.Scanner;

public class boxxx {
	public static void main(String[] args) {
	
		double w;
		double h;
		double area;
		double perimeter;
		Scanner input = new Scanner(System.in);
		System.out.println("w : ");
		w = input.nextDouble();
		System.out.println("h : ");
		h = input.nextDouble();
		area = w * h;
		perimeter = 2 * (w + h);
		
		System.out.println("≥–¿Ã : " + area);
		System.out.println("µ—∑π : " + perimeter);
	}
}
