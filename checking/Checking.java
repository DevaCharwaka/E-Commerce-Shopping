package com.checking;
import com.registration.*;
import com.processing.*;
import com.login.*;
import java.util.Scanner;

public class Checking {
	public static void main(String args[])throws Exception {
		Processing obj1 = new Processing();		
		Login obj2 = new Login();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter \n 1.Registration \n 2.Login");
		int choose=sc.nextInt();
		switch(choose) {
			case 1: obj1.register();
					break;
			case 2:obj2.loginCheck();		
					break;
			default:System.exit(0);		
		
	}

	}
}
