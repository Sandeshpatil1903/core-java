package com.demo.thread;

import java.util.concurrent.Callable;

public class MyTask implements Callable{
	private int start,stop;
	
	public MyTask(int start, int stop) {
		this.start=start;
		this.stop=stop;
	}
	
	public static int add(int start, int stop) {
		int sum=0;
		
		for(int i=start; i<=stop;i++) {
			sum+=i;
		}
		return sum;
		
	}

	@Override
	public Integer call() {
		 
		return add(start,stop);
	}
	


}
