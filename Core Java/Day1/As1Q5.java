
public class As1Q5 {
	public static void main(String[] args) {
		int primeupto = 100;
	
		
		for (int i=2; i<=primeupto; i++) {
			int flag = 0;
			for (int j=2; j<=i; j++) {
				if (i%j == 0) {
					flag++;
				}
			}
			if (flag == 1) {
				System.out.print(i + ",");
			}
		}
		
	}
}
