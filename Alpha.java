import java.util.Scanner;
public class VowelsCons {
public static void main(String [] args){
	Scanner in=new Scanner(System.in);
     char ch=in.next().charAt(0);
	if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
		System.out.println("Alphabet");
	}
	else{
		System.out.println("Not");
	}
}
}
