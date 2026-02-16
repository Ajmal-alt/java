// write the program find odd or Even without using % and 2 concepts?
// i/p: 4
// o/p: Even
// i/p: 11
// o/p: Odd


package day11;
import java.util.Scanner;
public class condition_test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		System.out.println((n&1)==0?"Even":"Odd");
	}
}

