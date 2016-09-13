package Assingment;

import java.util.Scanner;

public class Test1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
	    System.out.println("Enter the word to be printed");
	    String word=s1.next();
	    System.out.println("Enter the number of times to be printed");
	    int noOfTimes=s1.nextInt();
	    for(int i=1;i<=noOfTimes;i++){
	    	System.out.println(word);
	    }
	    int i=1;
	    while(i<=noOfTimes){
	    	System.out.println("Using while loop "+word);
	    	i++;
	    }
	}

}
