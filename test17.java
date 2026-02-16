//Take a string from the input and check whether or not it contains both letters and numerals

package day15;
import java.util.*;
public class test17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String a= scan.nextLine();
	      int le=0,nu=0;
	      for(int i=0;i<a.length();i++)
	      {
	        if(Character.isAlphabetic(a.charAt(i)))
	        {
	          le++;
	        }
	        else if (Character.isDigit(a.charAt(i)))
	        {
	          nu++;
	        }
	      }
	      System.out.print(le>0&&nu>0);
	}

}
