package com.demo.test;

import com.demo.service.FileHandlingService;
import com.demo.service.FileHandlingServiceImpl;

public class TestFile {

	public static void main(String[] args) {

		FileHandlingService fh = new FileHandlingServiceImpl();
		
		fh.writeFile();

	}

}
