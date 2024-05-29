import java.util.*;
import java.util.stream.*;

public class OddNumberSum {

    public static void main(String [] args) {
        System.out.printf("Hello Perfect Square by Odd Number Sum Solution #1%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java OddNumberSum%n");
            return;
        }

        int input = 16;
        OddNumberSum oddNumberSum = new OddNumberSum();
        boolean result = oddNumberSum.solution(input);
        if (result == true) {
            System.out.printf("The input is a perfect square%n");
        } else {
            System.out.printf("The input is not a perfect square%n");
        }
    }

    public boolean solution(int input) {
        System.out.printf("the input is %d%n", input);
        int sum = 0;
        int oddNumber = 1;
        int count = 0;
        while(sum < input) {
            System.out.printf("sum is %d%n", sum);
            System.out.printf("the odd number is %d%n", oddNumber);
            System.out.printf("the count of odd numbers is %d%n", count);
            sum += oddNumber;
            oddNumber += 2;
            count++;
        }
        System.out.printf("the final sum is %d%n", sum);
        System.out.printf("the final odd number is %d%n", oddNumber);
        System.out.printf("the final count of odd numbers is %d%n", count);
        System.out.printf("the the square of the number of digits, added together, is %d%n", count * count);
        return sum == input;
    }

}
