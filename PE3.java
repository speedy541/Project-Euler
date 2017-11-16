
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
public class PE3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scan.nextLong();

           for (long j = 2;j <= Math.floor(Math.sqrt(n));)
           {
                if (n % j == 0) {
                    n /= j;
                } 
                else 
                {
                    j++;
                }
            }
            System.out.println(n);
        
    }
}
}
