//Given an array of integers of size N, write a program to find and print the second largest (2nd maximum) element in the array.
//Note: The second maximum is the largest number excluding the maximum. Assume the array has at least two distinct elements.

package day14;
import java.io.*;
import java.util.*;
public class array11 {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner (System.in);
	        int n = scan.nextInt();
	        int a[]=new int[n];
	        for (int i = 0;i<n;i++)
	        {
	            a[i]=scan.nextInt();
	        }
	        int m1 = Integer.MIN_VALUE,m2=Integer.MIN_VALUE;
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]>m1)
	                m1=a[i];
	        }
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]>m2&&a[i]<m1)
	                m2=a[i];
	        }
	        System.out.print(m2!=Integer.MIN_VALUE?m2:m1);
	    }
	}
