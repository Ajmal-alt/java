//Read a string input and print all the vowels from the input string.

package day15;
import java.util.*;
public class test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	     String a= scan.nextLine();
	     for (int i =0;i<a.length();i++)
	     {
	       char b =a.charAt(i);
	       if(b=='A' || b=='E' || b=='I' || b=='O' || b=='U' || b=='a' || b=='e' || b=='i' || b=='o' | b=='u')
	       System.out.println(b);
	     }
	}

}
