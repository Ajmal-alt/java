//Given an array of integers of size N, write a program to calculate and print the average of all elements in the array.

package day14;
import java.util.*;
public class array06 {

	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=scan.nextLong();
        long sum = 0;
        for(int i =0;i<n;i++)
            sum+=a[i];
         float avg =(float)sum/n;
        System.out.printf("%.2f",(float)avg);
	}
}

