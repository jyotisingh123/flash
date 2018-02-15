package test;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr size of string");
		int size=sc.nextInt();
		RemoveDuplicate duplicate=new RemoveDuplicate(size);
		System.out.println("Enetr any string");
		String str=sc.nextLine();
		
		
		duplicate.removeDuplicateCharacter(str);

	}

}
