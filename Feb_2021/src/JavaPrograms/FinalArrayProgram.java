package JavaPrograms;

public class FinalArrayProgram 
{

	public static void main(String[] args) 
	{
		   final int arr[] = {1, 2, 3, 4, 5}; int sum=0; // Note: arr is final
	       for (int i = 0; i < arr.length; i++)
	       {
	           //arr[i] = arr[i]*10;  
	         //  System.out.println(arr[i]);   
	           sum=sum+arr[i];
	           System.out.println(sum);
	       }     

	}

}

// The array arr is declared as final, but the elements of array are changed without any problem. 
//Arrays are objects and object variables are always references in Java. 
//So, when we declare an object variable as final, 
//it means that the variable cannot be changed to refer to anything else. 
