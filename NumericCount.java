import java.util.Scanner;
public class NumericCount {
public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	String s1=str.replaceAll("[^0-9]","");
		System.out.println(s1.length());
}
}
