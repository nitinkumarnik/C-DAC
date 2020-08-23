package classroom;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileExamplePrimitive {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// open
		FileOutputStream fos = new FileOutputStream("batsy.txt");
		
		// write primitives
		DataOutputStream dos = new DataOutputStream(fos);
		
		// read from console
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Id:");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Name:");
		String name = br.readLine();
		System.out.println("Price:");
		float price = Float.parseFloat(br.readLine());
		System.out.println("Code:");
		int code = br.read();
		
		dos.writeInt(id);
		dos.writeUTF(name);
		dos.writeFloat(price);
		dos.writeChar(code);
		
		dos.close();
		ir.close();
		br.close();
		fos.close();
		
		System.out.println("Primitive over.");
		
		// open for read
		FileInputStream fis = new FileInputStream("batsy.txt");
		
		DataInputStream dis = new DataInputStream(fis);
		
		int pid = dis.readInt();
		String pname = dis.readUTF();
		float pprice = dis.readFloat();
		char co = dis.readChar();
		
		System.out.println(pid + " " + pname + " " + pprice + " " + co);
		dis.close();
	}
	
}
