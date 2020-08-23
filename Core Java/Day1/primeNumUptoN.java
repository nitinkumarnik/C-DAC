import java.util.Scanner;

public class primeNumUptoN {
	
	public static void primeNum(int num) {
		for (int i=2; i<=num; i++) {
			int flag = 0;
			for (int j=2; j<=i; j++) {
				if (i%j == 0) {
					flag++;
				}
			}
			if (flag == 1) {
				System.out.print(i + ", ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Prime numbers upto: ");
		int primeupto = scan.nextInt();
		primeNum(primeupto);
		
		scan.close();
	}
	
}
