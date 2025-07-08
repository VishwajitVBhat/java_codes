package file_handing;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo {
	public static void main(String[] args) {
		
		
		File file=new File("C:\\Desktop\\pentagon\\eg\\demo.txt");
			try {
				if(file.createNewFile()) {
					System.out.println("New file is created");
				}
				else {
					System.out.println("file alrredy exists");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		
			
			
			
		try {
			FileWriter writer=new FileWriter("C:\\Desktop\\pentagon\\eg\\demo.txt");
			writer.write("hi i am vishwajit");
			writer.close();
		}catch(Exception er) {
				er.printStackTrace();
			}
		
		
		
		
		
		
		try {
		int r;
		FileReader reader=new FileReader("C:\\Desktop\\pentagon\\eg\\demo.txt");
		while((r=reader.read())!=-1) {
		System.out.print((char)r);
			}
		reader.close();
		}catch(Exception err) {
			err.printStackTrace();
		}
		
		
		
		
		try {
			BufferedReader breader=new BufferedReader(new FileReader("C:\\Desktop\\pentagon\\eg\\demo.txt"));
			String l;
			while((l=breader.readLine())!=null) {
				System.out.println(l);
			}
			breader.close();
		}catch(Exception erre) {
			erre.printStackTrace();
		}
				}
	}
