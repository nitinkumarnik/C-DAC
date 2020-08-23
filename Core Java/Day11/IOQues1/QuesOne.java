package IOQues1;

import java.io.BufferedReader;
import java.io.FileReader;

public class QuesOne {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("hello.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		int numofline = 0;
		int numofspace = 0;
		int len=0;
		while ( (str = br.readLine()) != null ) {
			System.out.println(str);
			
			char[] chars = str.toCharArray();
			for (char ch : chars) {
				if (ch == ' ') {
					numofspace++;
				}
				len++;
			}
			numofline++;
		}
		System.out.println("***********************************");
		System.out.println("num of chars: "+ (len-numofspace));
		System.out.println("num of words: "+ (numofspace+numofline));
		System.out.println("num of lines: "+ numofline );
		
		
	}
	
}
