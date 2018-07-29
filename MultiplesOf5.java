import java.util.Scanner;
public class MultiplesOf5 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int x=0,count=a;
	for(int i=1;i<=(5*a);i++){
		if(i%5==0){
			System.out.print(i+" ");
		}
	}
}
}
