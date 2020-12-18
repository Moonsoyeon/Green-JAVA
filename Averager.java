import java.util.*;

public class Averager {
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("점수를 입력하시오 : ");
			int grade = s.nextInt();
			if(grade < 0)
				break;
			
			total = total + grade;
			count++;
		}
		System.out.println("평균은 " + total / count);
	}
}