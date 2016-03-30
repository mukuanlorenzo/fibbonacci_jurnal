
package fibo;


import java.util.Scanner;

public class Fibo {

    public Fibo() {
    }
   
    public static void main(String [] args){
        int n, m, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Batas Deret Fibbonaci = ");
        n = input.nextInt();
   
           for(i=n; i>=1; i--)
           {
          
        m = hitungFibbo(i);
        System.out.print(m+" ");
           } 
    }

    public static int hitungFibbo(int n){  
        int chan;
        if(n==0)
            return 0;
        if(n==1)
            return(1); 
        else
            chan = hitungFibbo(n-1) + hitungFibbo(n-2);           
        return chan;
    }
 }
