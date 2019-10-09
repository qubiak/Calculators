package calculatorcase;

import java.util.Scanner;

/**
 * @author qubiak
 *
 */
public class CalculatorCase {

    public static void main(String[] args) {

        double a;
        double b;
        char c;

        Scanner in = new Scanner(System.in);
        System.out.println("Give me a: ");
        a = in.nextDouble();
        System.out.println("Give me b: ");
        b = in.nextDouble();

        System.out.println("if you want to plus - press +");
        System.out.println("if you want to minus - press - ");
        System.out.println("if you want to multiply - press *");
        System.out.println("if you want to division - pres /");
        System.out.println("if you want to raise to square power - press ^");
        System.out.println("if you want to squer root - press &");
        System.out.println("if you want to divide the module - press %");

        c = in.next().charAt(0);

        switch (c) {
            case '+': {
                System.out.print(a + " + " + b + " = ");
                System.out.println(a + b);
                break;
            }

            case '-': {
                System.out.print(a + " - " + b + " = ");
                System.out.println(a - b);
                break;
            }

            case '*': {
                System.out.print(a + " * " + b + " = ");
                System.out.println(a * b);
                break;
            }

            case '/': {
                if (b != 0) {

                    System.out.print(a + " / " + b + " = ");
                    System.out.println(a / b);
                } else {
                    System.out.println("Error!! No works by zero!!");
                }
                break;
            }

            case '^': {
                System.out.print(" a ^ 2 = ");
                System.out.println(a * a);
                System.out.print(" b ^ 2 = ");
                System.out.println(b * b);
                break;
            }

            case '&': {
                if (a != 0 && b != 0) {
                    System.out.print("√" + a + " = ");
                    System.out.println(Math.sqrt(a));
                    System.out.print("√" + b + " = ");
                    System.out.println(Math.sqrt(b));
                } 
                else if (a != 0 && b == 0) {
                    System.out.print("√" + a +" = ");
                    System.out.println(Math.sqrt(a));
                    System.out.print("√" + b + " = ");
                    System.out.println("There no exist root of zero");
                } 
                else if (a == 0 && b != 0) {
                    System.out.print("√" + a + " = ");
                    System.out.println("There no exist root of zero");
                    System.out.print("√" + b + " = ");
                    System.out.println(Math.sqrt(b));
                } 
                else {
                    System.out.print("√" + a + " = ");
                    System.out.println("There no exist root of zero");
                    System.out.print("√" + b + " = ");
                    System.out.println("There no exist root of zero");
                }
                break;
            }
            case '%': {
                if (b != 0) {
                    System.out.print(" a % b = ");
                    System.out.println(a % b);
                } 
                else {
                    System.out.println("Error!! No works by zero!!");
                }
                break;
            }

        }
    }
}


