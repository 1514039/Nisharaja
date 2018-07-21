import java.util.Scanner;
public class SumofArray {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int sum=0;
		int n=in.nextInt();
		int k=in.nextInt();
		int a[]=new int[n];
		for(int i=1;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=1;i<=k;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
