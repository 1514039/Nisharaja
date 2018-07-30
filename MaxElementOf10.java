import java.util.Scanner;
public class MaxElementOf10 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int x=0,max=0;
	int a[]=new int[10];
	for(int i=0;i<10;i++){
		a[i]=in.nextInt();
	}
	for(int i=0;i<10;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	System.out.println(max);
}
}
