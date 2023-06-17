package Friends;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//private int id;
//private String name, lname, mobno,email,address;
//private Date bdate;
//private String hobby[];
//And do the following.
//1. Display All Friend
//2. Search by id
//3. Search by name
//4. Display all friend with a particular hobby
//5. Exit

public class FriendService {
      public static Friends farr[];
      public static int count;
      static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
      
      static {
    	  farr=new Friends[10];
    	  count=0;
      }
      
      

	public static void addFriend() {
		int id=count+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String nm=sc.next();
		System.out.println("Enter last name");
		String lnm=sc.next();
		sc.nextLine();
		System.out.println("Enter the mobile no");
		String mob=sc.nextLine();
		System.out.println("Enter the email");
		String email=sc.nextLine();
		System.out.println("Enter the address");
		String addres= sc.nextLine();
		System.out.println("Enter the date in (dd/MM/YYYY) format");
		String bdate=sc.next();
		Date bda=null;
		try {
			bda=sdf.parse(bdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int cnt=0;
		int choice=0;
		String []hobby= new String[5];
		System.out.println("Enter the hobby");
		do {
			System.out.println("\n 1. Enter hobby \n 2. Exit");
			choice=sc.nextInt();
			System.out.println("Enter the hobby");
			System.out.println();
			hobby[cnt]=sc.next();
		}while(choice!=2);
		
		farr[count++]=new Friends(id,nm,lnm,mob,email,addres,bda, hobby);
		
		}



	public static void displayAll() {
		for(int i=0; i<count;i++) {
			System.out.println(farr[i]);
		}
		
	}



	public static void displayById(int id) {
		for(int i=0; i<count;i++) {
			if(farr[i].getId()==id) {
				System.out.println(farr[i]);
				return;
			}
		}
		System.out.println("Not found");
	}



	public static void displayByName(String nm) {
		
		for(int i=0; i<count;i++) {
			if(farr[i].getName() ==nm) {
				System.out.println(farr[i]);
				return;
			}
		}
		System.out.println("Not found");
	}
		
		
	}
      
      

