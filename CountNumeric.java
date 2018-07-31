import java.util.Scanner;
public class CountNumeric {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int n=0;
	while(a!=0){
		a=a/10;
		n++;
	}
	System.out.println(n);
}
}
