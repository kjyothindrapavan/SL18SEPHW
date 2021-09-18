package com.practice.questions;

import java.util.Scanner;

public class FactorialSeries {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number print facorial series");
		n = sc.nextInt();
		long fact=1;
		for(int i=2;i<=n+1;i++){
			System.out.print(fact+" ");
			fact*=i;
		}
	}

}
