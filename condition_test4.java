// write the program second greatest among 3 numbers using ternary operator?
// i/p:12 15 7
// o/p:34



package day11;
import java.util.Scanner;
public class condition_test4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a>b&&a<c||a>c&&a<b)
		{
			System.out.println(a);
		}
		else if (b>a&&b<c||b>c&&b<a)
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(c);
		}
	}

}
