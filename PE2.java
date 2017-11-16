
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class PE2 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int tt=s.nextInt();
       while(tt!=0)
       {
        long n=s.nextLong();
       long a=1;
       long b=2;
       long sum=b;
       while((a+b)<=n)
       {
         if((a+b)%2==0)
           sum+=a+b;
         long t=a+b;
         a=b;
         b=t;
       }
       System.out.println(sum);
    tt--; 
       }
   
    }
    }

