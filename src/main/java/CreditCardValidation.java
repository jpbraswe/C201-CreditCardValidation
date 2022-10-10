import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CreditCardValidation {
    public static void main(String[] args) {

        checkCustomerIter();
        Scanner in = new Scanner(System.in);
        int count = 0;
        long array[] = new long [16];
        do
        {
            count = 0;
            array = new long [16];
            System.out.print("Please Provide A Credit Card Number : ");
            long number = in.nextLong();
            for (int i = 0; number != 0; i++) {
                array[i] = number % 10;
                number = number / 10;
                count++;
            }
        }
        while(count < 13);
        if ((array[count - 1] == 4) || (array[count - 1] == 5) || (array[count - 1] == 3 && array[count - 2] == 7)){
            if (isValid(array) == true) {
                System.out.println("\n The Credit Card Number is Valid. ");
            } else {
                System.out.println("\n The Credit Card Number is Invalid. ");
            }
        } else{
            System.out.println("\n The Credit Card Number is Invalid. ");
        }
    }

    public static void checkCustomerIter()
    {
        String[][] arr = new String[5][2];
        arr[0][0] = "A";
        arr[0][1] = "1234567890";
        arr[1][0] = "B";
        arr[1][1] = "12345678909876";
        arr[2][0] = "C";
        arr[2][1] = "9876543234456";
        arr[3][0] = "D";
        arr[3][1] = "124365678986556";
        arr[4][0] = "E";
        arr[4][1] = "9876234";
        for(int i=0; i<5; i++)
        {
            int count = arr[i][1].length();
            if(count < 13)
            {
                if ((arr[i][1].charAt(count - 1) == '4') || (arr[i][1].charAt(count - 1) == '5') || (arr[i][1].charAt(count - 1) == '3' && arr[i][1].charAt(count - 2) == '7'))
                {
                    System.out.println("");
                }
                else{

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {

                        bw.write(arr[i][0] + " : " + arr[i][1]);

                    } catch (IOException e) {

                        e.printStackTrace();

                    }
                }
            }
            else{

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {

                    bw.write(arr[i][0] + " : " + arr[i][1]);

                } catch (IOException e) {

                    e.printStackTrace();

                }
            }
        }}

    public static boolean isValid(long[] array) {
        int total = CalculateEvenPositionSumTest(array) + CalculateOddPositionSumTest(array);
        if ((total % 10 == 0)) {
            for (int i=0; i< array.length; i++){
            }
            return true;
        } else {
            for (int i=0; i< array.length; i++){
                System.out.println(array[i]);}
            return false;
        }
    }
    public static int GetCreditCardSizeTest(int number) {
        if (number <= 9) {
            return number;
        } else {
            int firstDigit = number % 10;
            int secondDigit = (int) (number / 10);
            return firstDigit + secondDigit;
        }
    }
    public static int CalculateOddPositionSumTest(long[] array) {
        int result = 0;
        for (int i=0; i< array.length; i++)
        {
            while (array[i] > 0) {
                result += (int) (array[i] % 10);
                array[i] = array[i] / 100;
            }
        }
        return result;
    }
    public static int CalculateEvenPositionSumTest(long[] array) {
        int result = 0;
        long temp = 0;
        for (int i=0; i< array.length; i++){
            while (array[i] > 0) {
                temp = array[i] % 100;
                result += GetCreditCardSizeTest(
                        (int) (temp / 10) * 2);
                array[i] = array[i] / 100;
            }
        }
        return result;
    }
}