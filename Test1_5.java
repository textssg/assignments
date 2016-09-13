package Assingment;

import java.util.Scanner;

public class Test1_5 {
	public static void main(String args[]){
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the number to find odd or even");
		int a=s1.nextInt();
		if(a%2==0){
			System.out.println("The number is even");
		}
		else{
			System.out.println("The number is odd");
		}
		System.out.println("Enter the 1st number");
		int b=s1.nextInt();
		System.out.println("Enter the 2nd number");
		int c=s1.nextInt();
		System.out.println("Enter the 3rd number");
		int d=s1.nextInt();
		if(b>c && b>d){
			System.out.println(+b+" is largest");
			}
		else if(c>d){
			System.out.println(+c+" is largest");
		}
		else{
			System.out.println(+d+" is largest");
		}
		if (b<c && b<d){
			System.out.println(+b+" is smallest");
		}
		else if(c<d){
			System.out.println(+c+" is smallest");
		}
		else{
			System.out.println(+d+" is smallest");
		}
	}
}
