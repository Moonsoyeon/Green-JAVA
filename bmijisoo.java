import java.util.*;

public class bmijisoo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("키(cm) : ");
		int key = s.nextInt();
		System.out.print("체중(kg) : ");
		int str = s.nextInt();
		
		double t = key * 0.01;
		double BMI = str / (t*t);
		
		if(BMI >= 40)
			System.out.println("고도 비만");
		else if(BMI >= 35)
			System.out.println("중등도 비만");
		else if(BMI >= 30)
			System.out.println("경도 비만");
		else if(BMI >= 25)
			System.out.println("과체중");
		else if(BMI >= 18.5)
			System.out.println("정상");
		else
			System.out.println("저체중");
	}
}