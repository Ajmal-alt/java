//Given an array of integers of size N, write a program to find and print the minimum element present in the array.


package day14;
import java.io.*;
import java.util.*;
public class array10 {

	public static void main(String[] args) {
		        Scanner scan= new Scanner(System.in);
		        int n = scan.nextInt();
		        int a[]= new int[n];
		        for (int i=0;i<n;i++)
		        {
		          a[i]=scan.nextInt();
		        }
		        int min = a[0];
		        for(int i =1;i<n;i++)
		        {
		          min=Math.min(a[i],min);
		        }
		        System.out.println(min);
		    }
}
