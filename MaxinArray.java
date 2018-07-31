import java.util.Arrays;
import java.util.Scanner;
public class MaxinArray {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int min=0,max=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
	}
	Arrays.sort(a);
	max=a[n-1];
	System.out.println(max);
}
}
