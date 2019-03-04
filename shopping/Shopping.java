package com.shopping;
import com.login.*;
import com.registration.Registration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.checking.*;
import com.processing.*;

public class Shopping {
static HashMap<Integer,String> cart =  new HashMap<Integer,String>();
	static Scanner sc = new Scanner(System.in);
	static int bal=100000;
		public static void choose() {

			int select;
			System.out.println("enter \n1.Male \n2.Female \n3.Children");
			select =sc.nextInt();
			switch(select) {
			case 1:shop();
					break;
			case 2: shop();
					break;
			case 3: shop();
					break;
			default:{
				System.out.println("you eneterd the wrong button,select any one ");
					choose();
				}
			}
		}
		public static void shop() {
			int select;
			System.out.println("enter \n1.Fashion(Clothes, Bags, Shoes) \n2.Home and Kitchen \n3.Electronics \n4.Go back\n5.Checkout");
			select =sc.nextInt();
			switch(select) {
			case 1: fashion();
					break;
			case 2: homeandKitchen();
					break;
			case 3: electronics();
					break;
			case 4:shop();
					break;
			case 5: checkout();
					break;
			default:{
				System.out.println("you eneterd the wrong button,select any one ");
					shop();
			}
		}
	}
		public static void fashion() {
			int select,ch;
			System.out.println("enter \n1.Shirts \n2.Dress Materials \n3.Trousers \n4.Go back");
			
			
			select =sc.nextInt();
			switch(select) {
			case 1: {
					System.out.println("Item no:1 \n1.Shirt-price:500");
					System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
					ch=sc.nextInt();	
					switch (ch) {	
							case 1 :cart.put(500,"Shirt");
									shop();
									break;
							case 2:	checkout();
									break;
							default:{
								System.out.println("you eneterd the wrong button,select any one ");
									fashion();
							}		
					}
			}
					break;
			case 2: {
						System.out.println("Item no:\n2. Dress Materials-price:600");
						System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
						ch=sc.nextInt();	
						switch (ch) {	
								case 1 :cart.put(600,"Dress material");
										shop();
										break;
								case 2:	checkout();
										break;
								default:{
									System.out.println("you eneterd the wrong button,select any one ");
										fashion();
								}		
						}
				
					break;
			}
			case 3:{ 
					System.out.println("Item no:\n3. Trousers-price:700");
					System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
					ch=sc.nextInt();	
					switch (ch) {	
							case 1 :cart.put(700,"Trousers");
									shop();
									break;
							case 2:	checkout();
									break;
							default:{
								System.out.println("you eneterd the wrong button,select any one ");
									fashion();
							}		
					}
			
					break;
					}
			case 4: shop();
					break;
			default:{
				System.out.println("you eneterd the wrong button,select any one ");
					fashion();

		}
			}
		}
		public static void homeandKitchen() {
			int select,ch;
			System.out.println("enter \n1.Fridge \n2.Grinder \n3.Cooler \n4.Go back");
			
			
			select =sc.nextInt();
			switch(select) {
			case 1: System.out.println("Item no:\n1.Fridge- price:15000");
			System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
			ch=sc.nextInt();	
			switch (ch) {	
					case 1 :cart.put(15000,"Fridge");
							shop();
							break;
					case 2:	checkout();
							break;
					default:{
						System.out.println("you eneterd the wrong button,select any one ");
							fashion();
					}		
			}
		
					break;
			case 2: System.out.println("Item no:\n2.Grinder- price:6000");
			System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
			ch=sc.nextInt();	
			switch (ch) {	
					case 1 :cart.put(6000,"Grinder");
							shop();
							break;
					case 2:	checkout();
							break;
					default:{
						System.out.println("you eneterd the wrong button,select any one ");
							fashion();
					}		
			}
	
					break;
			case 3: System.out.println("Item no:\n3.Cooler-price:9000");
			System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
			ch=sc.nextInt();	
			switch (ch) {	
					case 1 :cart.put(9000,"Cooler");
							shop();
							break;
					case 2:	checkout();
							break;
					default:{
						System.out.println("you eneterd the wrong button,select any one ");
							fashion();
					}		
			}
	
			break;
			case 4: shop();
					break;
			default:{
				System.out.println("you eneterd the wrong button,select any one ");
					homeandKitchen();

		}
			}
		}
		public static void electronics() {
			int select,ch;
			System.out.println("enter \n1.Mobiles \n2.Hair dryer \n3.Trimmer \n4.Go back");
			
			
			select =sc.nextInt();
			switch(select) {
			case 1: System.out.println("Item no:\n1.Mobile- price:12000");
			System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
			ch=sc.nextInt();	
			switch (ch) {	
					case 1 :cart.put(12000,"Mobile");
							shop();
							break;
					case 2:	checkout();
							break;
					default:{
						System.out.println("you eneterd the wrong button,select any one ");
							fashion();
					}		
			}
	
			break;
			case 2: System.out.println("Item no:\n2.Hair dryer- price:3000");
			System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
			ch=sc.nextInt();	
			switch (ch) {	
					case 1 :cart.put(3000,"Hair dryer");
							shop();
							break;
					case 2:	checkout();
							break;
					default:{
						System.out.println("you eneterd the wrong button,select any one ");
							fashion();
					}		
			}
		
			break;
			case 3: System.out.println("Item no:\n3.Trimmer-price:1500");
			System.out.println("press 1 for add to cart and continue shopping\n 2 for, if shoppig completed and checkout");
			ch=sc.nextInt();	
			switch (ch) {	
					case 1 :cart.put(1500,"Trimmer");
							shop();
							break;
					case 2:	checkout();
							break;
					default:{
						System.out.println("you eneterd the wrong button,select any one ");
							fashion();
					}		
			}
	
				break;
			case 4: shop();
					break;
			default:{
				System.out.println("you eneterd the wrong button,select any one ");
					electronics();

		}
			}			
		}
		public static void checkout() {
			int ch,payment;
			Integer sum=0;
			 Set<Integer> total = cart.keySet();
			System.out.println(cart);
			System.out.println("if you want to remove any item press 1 else 2");
			System.out.println("Enter the cost of that item to remove");
			ch=sc.nextInt();
			switch (ch) {
			case 1:	int cost=sc.nextInt();
						cart.remove(cost);
						break;
			case 2:	 
				for(Integer obj:total) {
					sum=sum+obj;
						}
				break;
			
			}
			System.out.println("Your cart has "+cart);	
			System.out.println("total amount to pay is "+sum);
			System.out.println("Payment options\n 1.Card\n 2.Online");
				payment = sc.nextInt();
				switch(payment) {
				case 1:bal=bal-sum;
						break;
				case 2:bal = bal-sum;
							break;
				default:{ 	
					System.out.println("you eneterd the wrong button,select any one ");
					checkout();
				}
				}
			
				Random random =new Random();
				int orderNo= random.nextInt(999999999)+random.nextInt(999999);
				
				System.out.println("your order number is "+Math.abs(orderNo) );	//System.out.println(Math.abs(cust.getAccNo()));
					System.out.println("your shopping has succesfully completed.\nPress 1.Shopping again\n2.Exit");
					int n;
					n=sc.nextInt();
					switch(n) {
					case 1:choose();
						break;
					case 2:System.exit(0);
						break;
					}
		

}

/*	public static void main(String[] args) {
		Registration obj = new Registration();
		obj.setBal(5000);
		// TODO Auto-generated method stub
		choose();
	}*/

}
