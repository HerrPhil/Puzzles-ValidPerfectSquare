# Puzzles-ValidPerfectSquare

Determine if a given integer is a valid perfect square.

## Background

The problem is straightforward: given a positive integer *num*, our task is to determine whether it
is a perfect square without using any built-in library functions, such as **sqrt**. A perfect square is
a number that can be expressed as the product of an integer with itself. For example, the
number 16 is a perfect square because it can be expressd as 4 x 4.

## Intution

To solve this problem, we can use two different methods - binary search and the math trick, sum of odd numbers.

### Method 1: Binary Search

The binary search approach involves setting two pointers *left* and *right*, where *left* starts at 1
(the smallest perfect square) and right starts at *num* (as the largest possible perfect square our
input could be). We iteratively narrow down the search range by finding the midpoint of *left* and
*right* and squaring it. If the square of this midpoint is larger than or equal to *num*, we know our
perfect square root, if it exists, is at or before this midpoint, so we move the *right* pointr to the
midpoint. Otherwise, we move *left* up to *mid + 1*. The moment *left* and *right* converge, we
check if the square of *left* is equal to *num* to conclude whether *num* is a perfect square.


