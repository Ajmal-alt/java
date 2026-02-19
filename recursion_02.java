// print sum of input using recursion
// i/p : 
// o/p :
package day17;
import java.util.*;
public class recursion_02 {
		int sum(int n)
		{
			if(n==0)
			{
				return 0;
			}
			return (n%10)+sum(n/10);
		}
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		recursion_02 m=new recursion_02();
		int n=scan.nextInt();
		System.out.println(m.sum(n));
	}
}
