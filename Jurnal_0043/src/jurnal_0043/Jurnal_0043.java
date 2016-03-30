/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal_0043;
 
import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class Jurnal_0043 {

    
    public static void main(String args[]) {
 
       
        System.out.print("Input   : ");
        int number = new Scanner(System.in).nextInt();
        int temp = 0;
        int sum = 0;
        System.out.println("Output : ");
        for(int i=1; i<=number; i++){
            temp = fibonacci(i);
            sum = sum+temp;
            
            
        }
        System.out.println(sum);
    } 
 
    
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return fibonacci(number-1) + fibonacci(number -2); 
    }
 
    
    
}
