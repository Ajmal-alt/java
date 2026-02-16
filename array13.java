//An element of an array is called a leader if no element to its right is greater than it. Given an array of size N, find and print all the leader elements.


package day14;
import java.io.*;
import java.util.*;
public class array13 {
	 public static void main(String[] args) {
		        Scanner scan = new Scanner (System.in);
		        int n=scan.nextInt();
		        int a[]=new int[n];
		        for(int i =0;i<n;i++)
		        {
		            a[i]=scan.nextInt();
		        }
		        for(int i =0;i<n;i++)
		        {
		            int f=0;
		            for(int j=i+1;j<n;j++)
		            {
		                if(a[j]>a[i])
		                {
		                    f=1;
		                    break;
		                }
		            }
		            if(f==0)
		                System.out.print(a[i]+" ");
		        }
	}

}
