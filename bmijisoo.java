import java.util.*;

public class bmijisoo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ű(cm) : ");
		int key = s.nextInt();
		System.out.print("ü��(kg) : ");
		int str = s.nextInt();
		
		double t = key * 0.01;
		double BMI = str / (t*t);
		
		if(BMI >= 40)
			System.out.println("�� ��");
		else if(BMI >= 35)
			System.out.println("�ߵ ��");
		else if(BMI >= 30)
			System.out.println("�浵 ��");
		else if(BMI >= 25)
			System.out.println("��ü��");
		else if(BMI >= 18.5)
			System.out.println("����");
		else
			System.out.println("��ü��");
	}
}