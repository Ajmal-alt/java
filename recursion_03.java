// print fibonacci series of given numbers using recursion


package day17;
import java.util.*;
public class recursion_03 {
	int fib(int n)
	{
		if (n==0 || n==1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		recursion_03 m = new recursion_03();
		int n=scan.nextInt();
		System.out.println(m.fib(n));
	}
}
