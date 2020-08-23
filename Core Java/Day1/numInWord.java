import java.util.Scanner;

public class numInWord {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a digit: ");
		int inNum = scan.nextInt();
		String numInWords;
		
		switch (inNum) {
		case 1:
			numInWords = "ONE";
			break;
			
		case 2:
			numInWords = "TWO";
			break;
			
		case 3:
			numInWords = "THREE";
			break;
			
		case 4:
			numInWords = "FOUR";
			break;
			
		case 5:
			numInWords = "FIVE";
			break;
			
		case 6:
			numInWords = "SIX";
			break;
			
		case 7:
			numInWords = "SEVEN";
			break;
			
		case 8:
			numInWords = "EIGHT";
			break;
			
		case 9:
			numInWords = "NINE";
			break;
			
		default:
			numInWords = "OTHER";
			break;
		}
		
		System.out.println(numInWords);
		
		scan.close();
	}
}
