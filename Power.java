import java.util.Scanner;
public class Power {
  public static void main(String [] args){
	  Scanner in=new Scanner(System.in);
	  int a=in.nextInt();
	  int b=in.nextInt();
	  int x=(int)Math.pow(a,b);
	  System.out.println(x);
  }
}
