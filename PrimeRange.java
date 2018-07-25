import java.util.Scanner;
public class PrimeRange {
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		   int n,p;
           int c=0;
           p=in.nextInt();
           n=in.nextInt();
           for(int i=p;i<=n;i++){
               for(int j=1;j<i;j++){
                   if(i%j==0){
                       c=1;
                       break;
                   }
               else{
                       c=1;
               }
               }
               if(c==1){
                   System.out.print(i+" ");
               }

           }
	}
}
