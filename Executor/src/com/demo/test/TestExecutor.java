package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.demo.thread.MyTask;

public class TestExecutor {
	
	public static void main(String[] args) {
		
	
	ExecutorService es= Executors.newFixedThreadPool(5);
	List<Future>flist=new ArrayList<>();
	
	for(int i=1; i<=91;i+=10) {
		MyTask m=new MyTask(i,i+9);
		Future f=es.submit(m);
		flist.add(f);
	}
	int total=0;
	  for(Future i:flist) {
		  try {
			  System.out.println("total "+i);
			total+=(int)i.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  System.out.println("Sum: "+total);
	  try {
		es.awaitTermination(500, TimeUnit.MILLISECONDS);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
