package training;

import java.io.*;

//Demonstrate Core Java Input Output Stream via FileIOStream, BufferedIOStream
public class InputOutputDemo {
	
	public static void main(String[] args) throws IOException{
		
		File f=new File("Demo.txt");
		
		//FileIOStream
				//Write Output to file
		
		FileOutputStream fos=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("This is written using file Output Stream");
		dos.close();
		
		
				//Read Input from file
		FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF();
		System.out.println(str);
		dis.close();
		
		
		
		//BufferedIOStream
		
		File fb=new File("Demo1.txt");
		
		FileOutputStream ffos=new FileOutputStream(fb);
		BufferedOutputStream bos=new BufferedOutputStream(ffos);
		String s="This is written using buffered Output Stream";
		byte b[]=s.getBytes();
		bos.write(b);
		bos.close();
		
		FileInputStream ffis=new FileInputStream(fb);
		BufferedInputStream bis=new BufferedInputStream(ffis);
		
		while(bis.available()>0) 
		{
			System.out.print((char)bis.read());
		}
		
		
		
	}
}

