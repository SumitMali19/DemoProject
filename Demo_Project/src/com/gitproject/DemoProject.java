package com.gitproject;

import java.util.Scanner;

// WAP to Fibonacci number
public class DemoProject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.println(" " +n1);
		System.out.println(" " +n2);
		for(int i=3; i<=number; i++) {
			int n3= n1+n2;
			  	n1= n2;
			  	n2= n3;
			  	System.out.println(" "+n3);
			  	
		}
	}

}
