import java.util.Scanner;
public class Swapbit {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int temp=0;
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.print(a+" ");
	System.out.println(b+" ");
}
}
