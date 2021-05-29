package JavaPrograms;

import java.util.Scanner;

public class FindTheNumberOfCharinString
{

	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter any string");
		//String str=sc.next();
		String str = "The best of both worlds";  
        int count = 0;  
          
        //Counts each character except space  
        //String.length()method for String of length. It returns count of total number of characters
        for(int i = 0; i < str.length(); i++) {  
          //The charAt() method returns the character at the specified index in a string.  
        	if(str.charAt(i) != ' ')  
                count++;  
        }  
          
        //Displays the total number of characters present in the given string  
        System.out.println("Total number of characters in a string : " + count);  


	}

}
