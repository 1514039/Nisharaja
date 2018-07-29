import java.util.Scanner;
public class MultiplesWith5No {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int x=0,count=a;
	for(int i=1;i<=(5*a);i++){
		if(i%a==0){
			System.out.print(i+" ");
		}
	}
}
}
