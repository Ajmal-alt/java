//Read an inout string and print the last 4 characters of the input as a string

package day15;
import java.util.*;
public class test9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String a =scan.nextLine();
	      System.out.println(a.substring(a.length()-4,a.length()));

	}

}
