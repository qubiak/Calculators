package easycalculator;

import java.util.Scanner;

/**
 *
 * @author qubiak
 */
public class EasyCalculator {

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {

        double a;
        double b;

        Scanner wej = new Scanner(System.in);
        System.out.println("Give my a ");
        a = wej.nextDouble();
        System.out.println("Give my b ");
        b = wej.nextDouble();

        EasyCalculator easyCalculator = new EasyCalculator();

        EasyCalculator.plus(a, b);
        EasyCalculator.minus(a, b);

        System.out.println(a + " plus " + b + " makes " + plus(a, b));
        System.out.println(a + " minus " + b + " makes " + minus(a, b));

    }

}
