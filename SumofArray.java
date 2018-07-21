import java.util.Scanner;
public class SumofArray {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int sum=0;
		int n=in.nextInt();
		int k=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		System.out.println(a[k]);
	}
}
