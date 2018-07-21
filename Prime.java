import java.util.Scanner;
public class Prime {
	public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	int i,count=0;
	int a=in.nextInt();
	for(i=1;i<=a;i++){
		if(a%i==0){
			count++;
		}
	}
	if(count==2){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
	}
}
