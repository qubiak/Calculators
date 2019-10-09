package bulidtriangle;

import java.util.Scanner;

/**
 * @author qubiak
 *
 */
public class BulidTriangle {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner in = new Scanner(System.in);

        System.out.println("Let's see if we can bulid a triangle");
        System.out.println("Give me a first side");
        System.out.println("a= ");
        a = in.nextDouble();
        System.out.println("Give me a second side");
        System.out.println("b= ");
        b = in.nextDouble();
        System.out.println("Give me a third side");
        System.out.println("c= ");
        c = in.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("We can bulid a triangle");
            System.out.print("The perimeter of this trangile will be ");
            System.out.println(a + b + c);
        } 
        else {
            System.out.println("Can't bulid a triangile");
        }

    }

}
