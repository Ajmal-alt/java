//Take a string from the input and print the last character of that string

package day15;
import java.util.*;
public class test15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String a= scan.nextLine();
	      System.out.print(a.charAt(a.length()-1));

	}

}
