import java.util.Scanner;
public class Amstrong {
public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=a,x=0,z=0;
	while(b!=0){
		x=b%10;
		b=b/10;
		z+=x*x*x;
	}
	if(z==a){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
}
}
