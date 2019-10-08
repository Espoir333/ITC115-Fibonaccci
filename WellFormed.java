public class WellFormed [

public static void main(String[] args) {
System.out.println("A WellFormed JavaProgram");
        System.out.println("usually ends with a character.");
        System.out.print ("\"");
        System.out.println("But we type");
        System.out.print("\\");
        System.out.println("instead!");
     
       
       int count = 12, num1 = 0, num2 = 1;
            System.out.print("Fibonacci Series of "+count+" numbers:");

            for (int i = 1; i <= count; ++i)
            {
                System.out.print(num1+" ");

                /* On each iteration, we are assigning second number
                 * to the first number and assigning the sum of last two
                 * numbers to the second number
                 */
                int sumOfPrevTwo = num1 + num2;
                num1 = num2;
                num2 = sumOfPrevTwo;  

    }

    }
}
