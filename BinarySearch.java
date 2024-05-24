import java.util.*;
import java.util.stream.*;

public class BinarySearch {

    public static void main(String [] args) {
        System.out.printf("Hello Perfect Square by Binary Search Solution #1%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java BinarySearch%n");
            return;
        }

        int input = 9;
        BinarySearch binarySearch = new BinarySearch();
        boolean result = binarySearch.solution(input);
        if (result == true) {
            System.out.printf("The input is a perfect square%n");
        } else {
            System.out.printf("The input is not a perfect square%n");
        }
    }

    public boolean solution(int input) {
        int left = 1;
        int right = input;
        while(left != right) {
            System.out.printf("the left pointer is %d%n", left);
            System.out.printf("the right pointer is %d%n", right);
            // find midpoint of left and right
            int midpoint = (left + right) / 2;
            System.out.printf("the midpoint is %d%n", midpoint);
            int midpointSquare = midpoint * midpoint;
            System.out.printf("the midpoint square is %d%n", midpointSquare);
            if (midpointSquare >= input) {
                System.out.printf("the midpoint square is greater than or equal to input%n");
                // we know our perfect square, if it exists, is at or before this point.
                // move right pointer to midpoint.
                System.out.printf("move the right pointer to midpoint%n");
                right = midpoint;
            } else {
                System.out.printf("the midpoint square is less than input%n");
                // we know our perfect square, if it exists, is below this point.
                // we conservatively move left pointer one position more than midpoint.
                System.out.printf("move the left pointer to midpoint + 1%n");
                left = midpoint + 1;
            }
        }
        int perfectSquareCandidate = left * left;
        System.out.printf("perfect square candidate is %d%n", perfectSquareCandidate);
        return perfectSquareCandidate == input;
    }

}
