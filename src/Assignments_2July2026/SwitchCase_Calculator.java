package Assignments_2July2026;

import java.util.Scanner;
public class SwitchCase_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        double num1=sc.nextDouble();
        System.out.println("Enter num2:");
        double num2=sc.nextDouble();
        System.out.println("Enter the Operator:(+,-,*,/):");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Result:"+(num1+num2));
                break;
            case '-':
                System.out.println("Result:"+(num1-num2));
                break;
            case '*':
                System.out.println("Result:"+(num1*num2));
                break;
            case '/':
                if(num2==0) System.out.println("Division by zero is not allowed");
                else System.out.println("Result:"+(num1/num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();

    }
}
