//Take a number and return all the even digits of the number.
//Input: 1204
//Output:
//2
//0
//4


package day13;

import java.util.*;

public class loop_test3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int n = scan.nextInt();
      int rev = 0, f = 0, n1 = n;
      if(n>0)
      {
           while(n>0)
           {
             int r = n%10;
             rev = rev*10+r;
             n/=10;
           }
           while(rev>0)
           {
             int r = rev%10;
             if(r%2==0)
             {
               System.out.println(r);
               f++;
             }
             rev/=10;
           }
           while(n1>0)
           {
             int r = n1%10;
             if(r!=0)
             {
               break;
             }
             else
             {
               System.out.println(0);
               f++;
             }
             n1/=10;
           }
           if(f==0)
           {
             System.out.println(-1);
           }
      }
           else
           {
             System.out.println(0);
           }
      
    }
}
