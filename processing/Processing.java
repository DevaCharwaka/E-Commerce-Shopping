package com.processing;
import com.login.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.checking.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.registration.*;
public class Processing {
	static Scanner sc= new Scanner(System.in);
static	ArrayList<Registration> details = new ArrayList<Registration>();
	
	public void register()throws Exception{
    int n,i;
	Processing obj1 = new Processing();		
	System.out.println("enter the number of customers to register ");
    n=sc.nextInt();
	System.out.println("enter the details of customers");
	//entering the details for newly registered customers
	Login obj2 = new Login();
	
	for(i=0;i<n;i++) {
    	 Registration cust = new Registration();	
		
    	 System.out.println("enter the name");
		cust.setName(sc.next());
		
		System.out.println("enter your Phone number");
		cust.setPhNo(sc.nextLong());
		
		System.out.println("enter the address ");
		cust.setAddress(sc.next());
		
		System.out.println("enter the password");
		cust.setPassword(sc.next());
			
		details.add(cust);  // adding the customers into the arraylist
		serialisable();
    }
	obj2.loginCheck();

	}
	static void serialisable()throws Exception{
		
		FileOutputStream output = new FileOutputStream("E:\\e-commerce.txt");
		ObjectOutputStream object=new ObjectOutputStream(output);
		object.writeObject(details);
		object.close();
		}


}
