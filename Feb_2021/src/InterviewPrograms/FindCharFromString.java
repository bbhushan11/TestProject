package InterviewPrograms;

import java.util.Scanner;

public class FindCharFromString
{

	public static void main(String[] args) 
	{
		//String s="Bhushan Pathak";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any characters");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			System.out.println("The Character in the string are:" +s.charAt(i));
		}

	}

}
