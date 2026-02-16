// Given an array of integers of size N, write a program to find and print the maximum element present in the array.

package day14;
import java.util.*;
public class array01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int a[]= new int[n];
		for (int i=0;i<n;i++)
		{
		  a[i]=scan.nextInt();
		}
		int max = a[0];
		for(int i =1;i<n;i++)
		{
		  max=Math.max(a[i],max);
		}
		System.out.println(max);

	}

}
