//Check how many times “e” is present in string.



package day15;
import java.util.*;
public class test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String a= scan.nextLine();
	      int count=0;
	      for (int i =0;i<a.length();i++)
	      {
	         char b =a.charAt(i);
	         if(b=='E' || b=='e' )
	         {
	           count++;
	         }
	      }
	      System.out.println(count);

	}

}
