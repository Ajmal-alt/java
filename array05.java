//Given an array of integers of size N, write a program to count how many numbers are even and how many are odd in the array.

package day14;
import java.util.*;
public class array05 {

	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int odd = 0;
        int even = 0;
        for (int i = 0;i<n;i++)
        {
            int num = scan.nextInt();
            if(num%2==0)
            {
                 even++;
            }
            else 
            {
                odd++;
            }
            
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);

	}

}
