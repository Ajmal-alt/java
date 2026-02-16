//Read an integer N. Then read N space-separated integers. Print all the elements of the array in the same order, separated by space.


package day14;
import java.io.*;
import java.util.*;
public class array02 {

		    public static void main(String[] args) {
		        Scanner scan= new Scanner(System.in);
		        int n = scan.nextInt();
		        int a[]= new int[n];
		        for (int i=0;i<n;i++)
		        {
		          a[i]=scan.nextInt();
		        }
		        for(int i = 0;i<n;i++)
		        System.out.print(a[i]+" ");
		    }
		}
	

