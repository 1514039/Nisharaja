import java.util.Scanner;
public class PalindromeNo {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int i,j,count=0;
	int a=in.nextInt();
	int b=a,n=0;
	while(a!=0){
		a=a/10;
		n++;
	}
	int c[]=new int[n];
	int d[]=new int[n];
	for(i=0;i<n;i++){
		c[i]=b%10;
		b=b/10;
	}	
	for(i=0,j=n-1;i<n;i++,j--){
	  if(c[i]==c[j]){
			count++;
		}
	}
	
	if(count==n){
		System.out.println("yes");
	}
	else{
		System.out.println("No");
	}
}
}
