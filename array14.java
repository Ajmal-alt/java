//Read an integer N. Then read N space-separated integers into an array.
//Find and print the middle element of the array.
//If N is odd,middle element. If N is even,average of the two middle elements.

package day14;
import java.util.*;
public class array14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int N = sc.nextInt();
            if (N <= 0) {
                System.out.println("N must be a positive integer.");
                return;
            }
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter integers only.");
                    return;
                }
            }
            if (N % 2 == 1) {
                System.out.println(arr[N / 2]);
            } else {
                double average = (arr[(N / 2) - 1] + arr[N / 2]) / 2.0;
                System.out.println((int) average);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }

	}

}
