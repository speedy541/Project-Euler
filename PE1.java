
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
public class PE1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        long n;
        while(t!=0)
        {
            n=s.nextLong();
            long n1=n/3;
            long n2=n/5;
            long n3=n/15;
            if(n%3==0)
            {n1--;
            }if(n%5==0)
            {n2--;
            }if(n%15==0)
            {n3--;
            }
          //  System.out.println(n1+" "+n2+" "+n3);
            
            n1=(3*(n1*(n1+1)))/2;
            n2=(5*(n2*(n2+1)))/2;
            n3=(15*(n3*(n3+1)))/2;
            System.out.println(n1+n2-n3);
            t--;
        }
    }
}
