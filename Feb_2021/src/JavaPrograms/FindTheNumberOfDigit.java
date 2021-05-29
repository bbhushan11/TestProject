package JavaPrograms;

import java.util.Scanner;

public class FindTheNumberOfDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		int count = 0;

	    while (num != 0) 
	    {
	      // num = num/10
	      num /= 10;//3452/10=345//345/10=34/
	      count++;
	    }

	    System.out.println("Number of digits: " + count);


	}

}
