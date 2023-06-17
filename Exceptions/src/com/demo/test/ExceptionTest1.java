package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	
	public static int divide(int i, int j) throws ArithmeticException{
		try {
			int z=i/j;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw new ArithmeticException("Gaurav is legend");
		}
		return j;
		
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int i,j;
		i=j=0;
		
		
		try {
			System.out.println("Enter the value of i");
			 i=sc.nextInt();
			System.out.println("Enter the value of j");
			j=sc.nextInt();
			int x=divide(i,j);
			int z=i/j;
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Error");
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("InputMisMatch Error");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Inside finally");
			//int z=i/j;
		} 
	}

}
