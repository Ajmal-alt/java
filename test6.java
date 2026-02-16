//Read a string input and return it with inverted cases, that is, uppercased characters are converted into lower case and vice-versa.

package day15;
import java.util.*;
public class test6 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
	     String a= scan.nextLine();
	     for (int i =0;i<a.length();i++)
	     {
	       if(Character.isUpperCase(a.charAt(i)))
	       {
	         System.out.print(Character.toLowerCase(a.charAt(i)));
	       }
	       else
	       {
	         System.out.print(Character.toUpperCase(a.charAt(i)));
	       }
	     }

	}

}
