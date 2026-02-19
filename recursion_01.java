package day17;

import java.util.Scanner;
public class recursion_01 {
		int sum(int n)
		{
			if(n==0)
			{
				return 0;
			}
			return n+sum(n-1);
		}
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		recursion_01 m=new recursion_01();
		int n=scan.nextInt();
		System.out.println(m.sum(n));
	}
}
