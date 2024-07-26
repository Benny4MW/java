package Basics;

import java.util.Scanner;

public class Add {

	public static void main(String[] args){
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		s.nextLine();
		System.out.Println("name:");
		String name;
		name=s.nextLine();
		c=a+b;
		System.out.println("add a="+a+" and b="+b+"is".+c);
		System.out.println("trainer:"+name);
		

	}

}
