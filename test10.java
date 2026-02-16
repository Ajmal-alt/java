//split()

package day15;
import java.util.*;
public class test10 {

	public static void main(String[] args) {
		 Scanner scan =new Scanner (System.in);
		 String a=scan.nextLine();
		 String b[]=a.split(" ");
		 for(String i:b)
			 System.out.println(i);
	}

}
