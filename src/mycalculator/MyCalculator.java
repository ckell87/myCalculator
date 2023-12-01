/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycalculator;

import java.util.Scanner;

/**
 *
 * @author under
 */
public class MyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("please pick two numbers ");
        double firstNum = sc.nextDouble();
        double secondNum = sc.nextDouble();
        System.out.println("no please pick either +, -, *, / ");
        char modifier = sc.next().charAt(0);
        double result;
         switch(modifier) {
        
        case '+' :
        result = firstNum + secondNum;
        break;
        
        case '-':
        result = firstNum - secondNum;
        break;
        
        case '*':
        result = firstNum * secondNum;
        break;
        
        case '/':
        result = firstNum / secondNum;
        break;
        
        default:
        System.out.println("you have not picked either +, - , *, / ");   
        break;
        
    }

        System.out.println(result);
}
}
    

