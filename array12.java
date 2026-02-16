//Read an integer N. Then read N space-separated integers into an array.
//Calculate the product of elements at even indices (0,2,4,...) and the product of elements at odd indices (1,3,5,...).
//Print the even index product in the first line. Print the odd index product in the second line.


package day14;
import java.io.*;
import java.util.*;
public class array12 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int N = sc.nextInt();
		        int[] arr = new int[N];
		        for (int i = 0; i < N; i++) {
		            arr[i] = sc.nextInt();
		        }
		        long evenProduct = 1;
		        long oddProduct = 1;
		        for (int i = 0; i < N; i++) {
		            if (i % 2 == 0) {
		                evenProduct *= arr[i];
		            } else {
		                oddProduct *= arr[i];
		            }
		        }
		        System.out.println(evenProduct);
		        System.out.println(oddProduct);
		        sc.close();
		    }
		}
