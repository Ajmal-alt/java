//Given an array of integers of size N, write a program to calculate and print the sum of all elements present in the array.


package day14;
import java.io.*;
import java.util.*;
public class array03 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int a[]= new int [n];
        int sum = 0;
        for (int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+= a[i];
        }
        System.out.println(sum);

	}

}
