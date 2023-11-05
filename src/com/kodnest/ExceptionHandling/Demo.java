package com.kodnest.ExceptionHandling;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try {
		System.out.println("Connection Established");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers for Division");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Division result is: " +c);
		}
		catch(Exception e)
		{
			System.out.println("Arthametic exception cannot / 0");
		}
		System.out.println("Connection Terminiated");
	}
}

