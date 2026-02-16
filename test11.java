//Take a string from the input and print the length of that string

package day15;
import java.util.*;
public class test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String a= scan.nextLine();
	      int count=0;
	      for (int i =0;i<a.length();i++)
	      {
	         char b =a.charAt(i);
	           count++;
	      }
	      System.out.println(count);

	}

}
