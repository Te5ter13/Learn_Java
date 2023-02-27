
package basicidea.InterfaceDemo;
import java.util.Scanner;
/**
 *
 * @author tester13
 */
public class FactorialCalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        FactorialCalculator calculator = new FactorialCalculatorImpl();
        long result = calculator.calculateFactorial(number);
        System.out.println("The factorial of "+number+" is "+ result);
    }
}
