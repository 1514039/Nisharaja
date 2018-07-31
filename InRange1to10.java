import java.util.Scanner;
public class InRange1to10 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	if(a<=10 && a>=1){
		System.out.println("yes");
	}
	else{
		System.out.println("No");
	}
}
}
