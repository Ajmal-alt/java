//Read the input string, print "YES" if the string length is greater than 10. If not, print "NO"


package day15;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
	      Scanner scan = new Scanner (System.in);
	      String a = scan.next();
	      if(a.length()>10)
	      {
	        System.out.println("YES");
	      }
	      else
	      {
	        System.out.println("NO");
	      }
	}
}
