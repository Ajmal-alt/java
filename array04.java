//Read an integer N. Then read N space-separated integers into an array.
//Print the elements from left to right in the first line. Print the elements from right to left in the second line.


package day14;
import java.io.*;
import java.util.*;
public class array04 {
	public static void main(String[] args) {
		        Scanner scan = new Scanner (System.in);
		        int n = scan.nextInt();
		        int a[]= new int [n];
		        for (int i = 0;i<n;i++)
		        {
		            a[i] = scan.nextInt();
		        }
		        for (int i =0;i<n;i++)
		        {
		             System.out.print(a[i]+" ");
		        }
		        System.out.println();
		        for (int i = n-1;i>=0;--i)
		        {
		            System.out.print(a[i]+" ");
		        }	        
		    }
		}
