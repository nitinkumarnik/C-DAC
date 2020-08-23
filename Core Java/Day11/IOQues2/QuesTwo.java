package IOQues2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QuesTwo {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader ui = new BufferedReader(ir);
		
		System.out.println("Enter file source: ");
		String src = ui.readLine();
		System.out.println("Enter file destination:");
		String dest = ui.readLine();
		
//		System.out.println(src);
//		System.out.println(dest);
		
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dest);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		
		while ( (str = br.readLine()) != null ) {
			fw.write(str + '\n');
		}
		
		fr.close();
		fw.close();
		
		System.out.println("Copying done...");
		
		
	}
	
}
