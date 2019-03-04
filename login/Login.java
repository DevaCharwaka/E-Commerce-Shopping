package com.login;
import com.registration.Registration;
import com.shopping.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.registration.Registration;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Login {
	
	 public static ArrayList<Registration> deserialize() throws Exception {
		 Registration cust = new Registration();
			FileInputStream out=new FileInputStream("E:\\e-commerce.txt");
			ObjectInputStream obj=new ObjectInputStream(out);
			ArrayList<Registration> array=(ArrayList<Registration>)obj.readObject();
			return array;
	 }
	
/*	public static void loginShop() throws Exception{
		//	String name,address,password;
	//	long phNo;
		ArrayList<Registration> array = deserialize();
		for(Registration cust:array) {
			System.out.println(cust.getAddress()+" "+cust.getName()+" "+cust.getPassword()+" "+cust.getPhNo());
		}

}*/
	//checking for login 
	public static void loginCheck()throws Exception {
		Shopping obj3 = new Shopping();
		ArrayList<Registration> array = deserialize();
		Scanner sc = new Scanner(System.in);
		long mobNo;
		String passWord;
		int count=0;
		System.out.println("Login checking");
		System.out.println("enter mobile number ");
		mobNo=sc.nextLong();
		System.out.println("enter the Password ");
		passWord=sc.next();		

		for(int i=0;i<array.size();i++) {
		Registration cust = array.get(i);
		if (cust.getPhNo()==mobNo){
			if(cust.getPassword().equals(passWord))
			{
			System.out.println("you can do shopping");
			obj3.choose();
			count=1;
			break;
			}
			else	{
				System.out.println("Wrong mobile number or password");	
			}
			}
		}
	if(count==0)
		System.out.println("Wrong mobile number or password");	
	}

	
	
}
