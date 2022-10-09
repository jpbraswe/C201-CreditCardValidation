# Java Validating Credit Cards

Complete the methods in the CreditCardValidation.java file. Use the following
steps to complete your task.

In 1954 Hans Luhn, who worked at IBM at the time, proposed an algorithm for validating credit card numbers. The
algorithm is useful in determining if a card number is correct. Most credit card numbers must pass this validity check,
commonly known as the Luhn check or the Mod 10 check, which can be described as follows (for this
illustration, consider the card number 4388 5760 1840 2626):

1. Double every second digit from right to left. If doubling of a digit results in a two-digit number,
   add up the two digits to get a single-digit number.
```
       2 * 2 = 4

       2 * 2 = 4

       4 * 2 = 8

       1 * 2 = 2

       6 * 2 = 12 (1 + 2 = 3)

       5 * 2 = 10 (1 + 0 = 1)

       8 * 2 = 16 (1 + 6 = 7)

       4 * 2 = 8
```

2. Now add all single-digit numbers from Step 1.
```
       4 + 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
```
3. Add all digits in the odd places from right to left in the card number.
```
       6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38 
```
4. Sum the results from Step 2 and Step 3.
```
       37 + 38 = 75
```
5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For
   example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.

## Required Tasks
To complete this assignment you must do the following:

- Finish the methods in CreditCardValidation.java.
- Have at least **3 total** unit tests in each test file. 
- [Have your code coverage be a minimum of 80%](https://www.jetbrains.com/help/idea/running-test-with-coverage.html#run-config-with-coverage).
## Reference 

- For another pseudocode reference, you can look at [wikipedia](https://en.wikipedia.org/wiki/Luhn_algorithm#Pseudocode_implementation).