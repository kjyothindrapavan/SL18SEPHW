package com.practice.questions;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter any sentence to count characters");
		str = sc.nextLine();
		int ucCount=0;
		int lcCount=0;
		int nuCount=0;
		int spCount=0;
		int scCount=0;
		char c;
		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			if(Character.isUpperCase(c)){
				ucCount++;
			}
			else if(Character.isLowerCase(c)){
				lcCount++;
			}
			else if(Character.isDigit(c)){
				nuCount++;
			}
			else if(Character.isSpaceChar(c)){
				spCount++;
			}
			else {
				scCount++;
			}
		}
		System.out.println("UppercaseCount: "+ucCount);
		System.out.println("LowerCaseCount: "+lcCount);
		System.out.println("NumbersCount: "+nuCount);
		System.out.println("SpaceCount: "+spCount);
		System.out.println("SpecialCharacterCount: "+scCount);
	}

}
