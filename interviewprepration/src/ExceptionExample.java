import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First number: ");
            int a = sc.nextInt();
            System.out.println("Enter Second number: ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("denominator can not be zero");
        }
        catch (InputMismatchException ex){
            System.out.println("Enter only integer type data");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
