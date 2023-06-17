package com.demo.test;

import com.demo.beans.Coffee;

public class EnumTest {
	public static void main(String[] args) {
		
	
	Coffee c=Coffee.medium;
	System.out.println("cname: "+c.ordinal());
	System.out.println(c);
	
	switch(c.ordinal()) {
	case 0:
		System.out.println(c.getPrice());
		System.out.println(c.getSize());
		break;
	case 1:
		System.out.println(c.getPrice());
		System.out.println(c.getSize());
		break;
	}
	}
	
}
