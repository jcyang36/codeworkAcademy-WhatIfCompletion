package completing;

import java.util.Scanner;

public class WhatIfCompletion {
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();
        
        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();
        
        
        int sum=num1+num2;
        System.out.println( "The sum :" +sum);
        
        
        int product=num1*num2;
        System.out.println( "The product :" +product);
        
        double average=(num1+num2)/2.0;
        System.out.println( "The average :" +average);
        
        
    }
}