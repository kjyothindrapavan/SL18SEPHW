package com.practice.questions;

import java.util.Scanner;

public class Facotorial {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate facorial");
		n = sc.nextInt();
		long ans=1;
		for(int i=2;i<=n;i++){
			ans*=i;
		}
		System.out.println(ans);
	}

}
