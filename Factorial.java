package Assingment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		System.out.println("Enter the number");
		Scanner s1=new Scanner(System.in);
		int x=s1.nextInt();
		for(int i =1;i<=x;i++){
			fact=fact*i;
		}
		System.out.println("The factorial of the given number is " + fact);
	}

}
