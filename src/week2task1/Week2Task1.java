/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2task1;

import java.util.Scanner;

/**
 *
 * @author QTV
 */
public class Week2Task1 {
    public static int gcd(int a,int b){
        if(a<0){
            a = -a;
        }
        if(b<0){
            b = -b;
        }
        if(a == 0 && b == 0){
            System.out.println("Khong co UCLN");
        }
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if (a==0){
            System.out.println("UCLN:"+b);
        }
        else{
            System.out.println("UCLN:"+a);
        }
        return 0 ;
    }
    public static int fibonacci(int n){
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        
        if (n<0){
            return -1;
        } else if (n ==0 || n == 1){
            return n;
        } else {
            for (int i = 2;i<n;i++){
                f0 = f1 ;
                f1 = fn ;
                fn = f0 + f1;
            }
        }
        
        return fn ;
    }
    class sieveEratosthenes {   
    public void sieveEratosthenes(int m){
        boolean prime[] = new boolean[m+1];
        for(int i=0;i<m;i++){
            prime[i] = true;
        }
        for(int p = 2;p*p <=m;p++){
            if(prime[p] == true){
                for(int i = p*2; i <= m; i +=p ){
                    prime[i] = false;
                }
            }
        }
        for(int i = 2;i <=m ;i++){
            if(prime[i]==true){
                System.out.print(i+ " ");
            }
        }

    }
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a :");
        a = in.nextInt();
        System.out.println("Nhap b :");
        b = in.nextInt();
        gcd(a,b);
        
        System.out.println("Nhap n :");
        n = in.nextInt();
        System.out.println("Fibonaci =" +fibonacci(n));
        
        int m = 100;
        System.out.print(" ");
        System.out.println(" ");
        Week2Task1 obj = new Week2Task1();
        Week2Task1.sieveEratosthenes g = obj.new sieveEratosthenes();
        g.sieveEratosthenes(m);
    }
    
}
