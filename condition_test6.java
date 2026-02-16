//write a program find character type ?
// i/p: 'A'             |        '7'        |       's'
// o/p: upper case      |      digit        |  lower case



package day11;
import java.util.*;
public class condition_test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		char n = scan.next().charAt(0);
		if (n>='A'&&n<='Z')
		{
			System.out.println("upper case");
		}
		else if(n>='a'&&n<='z')
		{
		   System.out.println("lower case");	
		}
		else
		{
			System.out.println("digit");
		}
	}
}



