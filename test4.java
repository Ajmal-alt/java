//Read an input string and print the count of vowels in the input.

package day15;
import java.util.*;
public class test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String a= scan.nextLine();
	      int count=0;
	      for (int i =0;i<a.length();i++)
	      {
	         char b =a.charAt(i);
	         if(b=='A' || b=='E' || b=='I' || b=='O' || b=='U' || b=='a' || b=='e' || b=='i' || b=='o' | b=='u')
	         {
	           count++;
	         }
	      }
	      System.out.println(count);

	}

}
