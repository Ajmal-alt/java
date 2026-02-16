//Take a number as input and return the sum of all of its digits
//Input: 100
//Output:1



package day13;

import java.util.*;

public class loop_test2{
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int a = scan.nextInt();
      int sum = 0;
      while(a>0)
      {
      int t = a%10;
      sum+=t;
      a/=10;
    }
    System.out.println(sum);
    }
}
