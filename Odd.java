import java.util.Scanner;
public class Odd {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i,x=0;
		int a=input.nextInt();
		int b=input.nextInt();
		for(i=a+1;i<b;i++){
		      if(i%2==1){
		    	System.out.println(i);  
		      }
		}
	}

}
