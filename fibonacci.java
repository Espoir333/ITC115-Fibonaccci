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
            fibo1 = fibonacci; } }

Read more: https://github.com/Espoir333/ITC115-Fibonaccci
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

   
