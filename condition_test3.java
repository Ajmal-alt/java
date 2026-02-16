// write the program greatest among 3 numbers using ternary operator?
// i/p:34 56 12 
// o/p:56

package day11;
import java.util.*;
public class condition_test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println((a>b&&a>c)?a:(b>c)?b:c);
	}
}
