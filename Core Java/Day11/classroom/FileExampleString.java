package classroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileExampleString {

	public static void main(String[] args) throws IOException {
		
//		create file and open in writer mode.
		FileWriter fw = new FileWriter("bat.txt");
		
//		String str = "This to be written.";
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter string to write to file.");
		String strbr;
		
		while (!(strbr = br.readLine()).equals("exit")) {
			fw.write(strbr + '\n');
		}
		
//		fw.write(strbr);
		
		fw.close();
		System.out.println("Writing over.");
		
		
		FileReader fr = new FileReader("bat.txt");
		BufferedReader brf = new BufferedReader(fr);
		
		System.out.println("Reading from file:");
		String strbrf = brf.readLine();
		while ((strbrf = brf.readLine()) != null) {
			System.out.println(strbrf);
		}
		
		
		fr.close();
		System.out.println("Reader closed.");
		
		
		
	}
	
}
