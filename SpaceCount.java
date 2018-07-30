import java.util.Scanner;
public class SpaceCount {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	String s[]=str.split(" ");
	int l=s.length;
	System.out.println(l-1);
}
}
