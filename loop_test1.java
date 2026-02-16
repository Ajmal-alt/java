//Write a program to take two integers as input and print the HCF and LCM of the two numbers.
//Input:
//2
//3
//Output:
//1
//6


package day13;

import java.util.*;
import java.lang.*;
public class loop_test1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int min = Math.min(a,b);
      int hcf=0 , lcm = 0;
      for(int i=1;i<=min;i++)
      {
        if(a%i==0&&b%i==0)
        {
          hcf=i;
        }
      }
      if(a!=0&&b!=0)
      {
        lcm=(a*b)/hcf;
      }
      System.out.println(hcf+"\n"+lcm);
    }
}