import java.util.Scanner;
public class SpecialCount {
public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	String s1=str.replaceAll("[A-Za-z0-9]","");
		System.out.println(s1.length());
}
}
