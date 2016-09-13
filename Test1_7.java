package Assingment;

import java.util.Scanner;

public class Test1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s1.nextInt();
		for(int i=1;i<=10;i++){
			if(i==a){
				continue;
			}
			System.out.println(i);
		}
		
	}

}
