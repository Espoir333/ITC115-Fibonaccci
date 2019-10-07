import java.util.Arrays;
import java.util.Scanner;

/**
 * Java program to find Fibonacci series of a given number and print them in
 * console. For example, if input is 9 then your program should print 1 1 2 3 5
 * 8 13 21 34 55 89
 *
 * @author Espoir333
 *
 */
public class HelloFibonacci {

    public static void main(String args[]) {
        fibonacci(8);
        fibonacci(9);
        fibonacci(10);

        fibonacciSeries(11);
        fibonacciSeries(12);

    }

    /*
     * Printing Fibonacci series of a given number using for loop
     */
    public static void fibonacci(int number) {
        int fibo1 = 1;
        int fibo2 = 1;

        System.out.printf("%nFibonacci series of %d numbers are : ", number);
        System.out.printf("%s ", fibo1);
        System.out.printf("%s ", fibo2);

        for (int i = 2; i &lt; number; i++) {
            int fibonacci = fibo1 + fibo2;
            System.out.printf("%s ", fibonacci);
            fibo2 = fibo1;
            fibo1 = fibonacci;
        }
    }

    public static void fibonacciSeries(int number) {
        System.out.printf("\nFibonacci series in Java of number %s using recursion %n", number);
        for (int i = 1; i &lt;= number; i++) {
            System.out.printf("%s ", getFibonacci(i));
        }

    }
    
    
    /*
     * Fibonacci series in Java of a given number Recursion.
     */
    public static int getFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

}


Output
Fibonacci series of 8 numbers are : 1 1 2 3 5 8 13 21
Fibonacci series of 9 numbers are : 1 1 2 3 5 8 13 21 34
Fibonacci series of 10 numbers are : 1 1 2 3 5 8 13 21 34 55
Fibonacci series in Java of number 11 using recursion
1 1 2 3 5 8 13 21 34 55 89
Fibonacci series in Java of number 12 using recursion
1 1 2 3 5 8 13 21 34 55 89 144

Read more: https://https://github.com/Espoir333/ITC115-Fibonaccci/new/master

