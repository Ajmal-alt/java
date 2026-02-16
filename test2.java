//Read a string input, print each of its characters in a new line.


package day15;
import java.util.*;
public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String str = scan.nextLine();
	      for(int i = 0;i<str.length();i++)
	      {
	        System.out.println(str.charAt(i));
	      }

	}

}
