package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		Student s= new Student("Sandy",12);
		
		Class c=s.getClass();
		
		Method [] m=c.getMethods();
		
		for(Method m1:m) {
			System.out.print(m1.getName()+"--->"+m1.getModifiers()+"--->");
			System.out.println(m1.getReturnType());
		}
		
	
		Constructor [] c1=c.getConstructors();
		System.out.println("-------------------------Constructor--------------------------------");
		for(Constructor t:c1) {
			System.out.println(t.getName()+"--->"+t.getParameterCount());
		}
		
		
		Field farr[]=c.getDeclaredFields();
		System.out.println("-----------------------Fields---------------------------------------");
		for(Field f:farr) {
		System.out.println(f.getName());
		}
		farr[0].setAccessible(true);
		try {
			farr[0].set(s, "sadfasf");
			System.out.println(s);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Method x=c.getDeclaredMethod("square", int.class);
			try {
				System.out.println(x.invoke(s, 100));
				
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
