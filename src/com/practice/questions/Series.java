package com.practice.questions;

import java.util.Scanner;

public class Series {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number upto which 1 2 2 4 8 series to be printed");
		n=sc.nextInt();
		int a,b,c;
		a=1;
		b=2;
		if(n==1){
			System.out.println(a);
		}
		else if(n==2){
			System.out.println(a+" "+b);
		}
		else{
			System.out.print(a+" "+b);
			for(int i=3;i<=n;i++){
				c = a*b;
				System.out.print(" "+c);
				a=b;
				b=c;
				
			}
		}
	}
}
