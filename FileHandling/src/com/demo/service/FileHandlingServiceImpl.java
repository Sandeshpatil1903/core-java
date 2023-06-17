package com.demo.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingServiceImpl implements FileHandlingService{

	@Override
	public void writeFile()  {
		System.out.println("sfsdgsg");
		Scanner sc=new Scanner(System.in);
		File f= new File("Sandy.txt");
		DataOutputStream dos=null;
		
		
			try {
				if(!f.exists()) {
				dos=new DataOutputStream(new FileOutputStream("Sandy5dos.txt "));
				}
				else {
					dos=new DataOutputStream(new FileOutputStream("Sandy5dos.txt",true));
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		try(DataInputStream dis=new DataInputStream(new FileInputStream("Sandy.txt"));
				DataOutputStream dos1=dos;){
			String s=dis.readUTF();
			while(s!=null) {
				System.out.println(s);
				dos.writeUTF(s);
				s=dis.readUTF();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		try(FileInputStream fis= new FileInputStream("Sandy.txt");
//			FileOutputStream fos=new FileOutputStream("Sandy1.txt");
//				FileReader fr= new FileReader("Sandy.txt");
//				FileWriter fw=new FileWriter("Sandy2.txt");
//				BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Sandy.txt"));
//				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("Sandy3.txt"))){
//			
//			//System.out.println("Size of char :"+Character.(c));
//			int i=fis.read();
//			int count=0;
//			while(i!=-1) {
//				++count;
//				System.out.println(count);
//				System.out.println(i);
//				fos.write(i);
//				i=fis.read();
//			}
////			i=fr.read();
////			while(i!=-1) {
////				System.out.println(i);
////				fw.write(i);
////				i=fr.read();
////			}
////			i=bis.read();
////			while(i!=-1){
////				System.out.println(i);
////			 bos.write(i);
////			 i=bis.read();
////			}
//			
//		}catch(IOException e) {
//			System.out.println();
//		}
		
	}
	
	
}
