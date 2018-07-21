import java.util.Scanner;
public class SumofNatural {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=0,n=in.nextInt();
        for(int i=1;i<=n;i++){
             x=x+i;
        }
        System.out.println(x);
	}
}
