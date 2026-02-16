// write the program convert character number to integer number ? '0'>=n,='9'
// i/p: 7
// o/p: 7


package day11;
import java.util.Scanner;
public class condition_test2 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner (System.in);
	    char a = scan.next().charAt(0);
	    System.out.println(a-'0');
	}
}
