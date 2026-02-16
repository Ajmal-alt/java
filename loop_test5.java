//Take two integers as input and return all the prime numbers in between them (exclusive range).
//Input:
//2
//10
//Output:
//3
//5
//7


package day13;

import java.util.*;

public class loop_test5 {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int n = scan.nextInt();
      int m = scan.nextInt();
      for(int i=n+1;i<m;i++)
      {
        int c=0;
        for(int j=1;j<=i;j++)
        {
          if(i%j==0)
            c++;
        }
          if(c==2)
            System.out.println(i);
      }
      
    }
}
