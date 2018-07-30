import java.util.Scanner;
public class Fibanocci {
public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int n1=0,n2=1,n3,i;
	System.out.print(n2);
	for(i=2;i<=a;i++){
		n3=n1+n2;
		System.out.print(" "+n3+" ");
		n1=n2;
		n2=n3;
	}
}
}
