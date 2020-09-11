package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        // for(init; termination; increment){
        // }

        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // using the for statement, call the calculateInterest method with the mount of 10000
        // with an interestRate of 2,3,4,5,6,7, and 8 and print the result to the console window

        System.out.println("*************");

        for(int i=2; i<9; i++){
            System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000.0, i));
            // System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
            // the String.format("%.2f",...); will format the output of the calculations to have only two decimal points
        }

        System.out.println("*************");

        // how would you modify the for loop above to do the same thing as shown but to start from 8% and work back to 2%?

        for(int i=8; i>=2; i--){
            System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("*************");

        // Create a for statement using any range of numbers. Determine if the number is a prime number using the isPrime
        // method. If it is a prime number, print it out AND increment the count of the number of prime numbers found. If
        // that count is 7 exit the loop.
        // hint: use the break; statement to exit

        int count = 0;
        for(int i=1; i<=30; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if(count == 7) {
                    System.out.println("Goodbye loop for now!");
                    break;
                }

            }
        }
    }


    // code to generate a Prime number
    public static boolean isPrime(int n) {

        if(n == 1 ) {
            return false;
        }

        for(int i=2; i<= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }



    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
