//ake a string from the input and print the first character and last characters of the string together

package day15;
import java.util.*;
public class test16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String a= scan.nextLine();
	      System.out.print(a.charAt(0)+""+a.charAt(a.length()-1));

	}

}
