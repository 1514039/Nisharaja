import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a>=1 && a<=1000){
			System.out.println("Positive");
		}
		else if(a==0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Negative")
		}
	}
}
