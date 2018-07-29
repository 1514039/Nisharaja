import java.util.Scanner;
public class Amstrong {
public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int l=in.nextInt();
	int x=0,z=0,y=0;
	for(int i=a;i<l;i++){
	int	b=i;
	int c=b;
	while(c>0){
       x=c%10;
	   z+=x*x*x;
	    c=c/10;
	}
	if(z==b){
		System.out.println(b);
	}
	z=0;	
	}
}
}
