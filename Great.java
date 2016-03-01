//1.	Write a program to find the largest number between two number using ternary operator.(User Input)

import java.io.*;              //Provides for system input and output through data streams, serialization and the file system.
class Great
	{
	   public static void main(String args[])  throws IOException
	   {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 1st number = ");
			int i=Integer.parseInt(br.readLine());
		System.out.print("Enter 2nd number = ");
			int j=Integer.parseInt(br.readLine());
		System.out.print("Enter 3rd number = ");
			int k=Integer.parseInt(br.readLine());
		
		int temp=i>j?i:j;           //using ternary operator
		int m=temp>k?temp:k;			//using ternary operator
		
		System.out.println("The Greatest number between "+i +","+j +" and "+k +" is "+m);
	   }
		
	}