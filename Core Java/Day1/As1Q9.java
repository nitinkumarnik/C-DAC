
public class As1Q9 {
	public static void main(String[] args) {
		int num1 = 343;
		int num2 = 2394;
		int num3 = 22;

		int largestNum;

		if (num1 > num2 && num1 > num3) {
			largestNum = num1;
		} else if (num2 > num1 && num2 > num3) {
			largestNum = num2;
		} else {
			largestNum = num3;
		}

		System.out.println("From " + " " + num1 + " " + num2 + " " + num3 + " largest is " + largestNum);
	}
}
