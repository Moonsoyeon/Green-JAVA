import java.util.*;

public class LetterGame {
	public static void main(String[] args) {
		Random r = new Random();
		int answer = r.nextInt(100);
		int guess;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("������ �����Ͽ� ���ÿ� : ");
			guess = scan.nextInt();
			tries++;
			
			if(guess > answer)
				System.out.println("������ ������ �����ϴ�");
			if(guess < answer)
				System.out.println("������ ������ �����ϴ�");
		} while (guess != answer);
		
		System.out.printf("�����մϴ�. �õ� Ƚ�� = %d \n", tries);
	}
	
}