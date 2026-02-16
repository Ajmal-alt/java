//Take an integer an return 'YES' if the input is a palindrome, or 'NO' if it is not.
//Input: 1221
//Output: YES


package day13;

import java.util.*;

public class loop_test4 {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int a = scan.nextInt();
      int rev=0;
      int b=a;
      while(a>0)
           {
             int r = a%10;
             rev = rev*10+r;
             a/=10;
           }
           if(b==rev)
           {
             System.out.println("YES");
           }
           else
           {
             System.out.println("NO");
           }
           
    }
}