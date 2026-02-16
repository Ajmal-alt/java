//Check the given 2 strings are anagrams.
//Hint: anagram means the strings contains same characters but order of characters is not important
//Note: Ignore considering the case or spaces.


package day15;
import java.util.*;
public class test18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	      String a= scan.nextLine();
	      String b= scan.nextLine();
	      a=a.toUpperCase();
	      b=b.toUpperCase();
	      a=a.replaceAll("\\s+","");
	      b=b.replaceAll("\\s+","");
	      char ar[]=a.toCharArray();
	      char arr[]=b.toCharArray();
	      Arrays.sort(ar);
	      Arrays.sort(arr);
	      System.out.println(Arrays.equals(ar,arr));
	}
}
