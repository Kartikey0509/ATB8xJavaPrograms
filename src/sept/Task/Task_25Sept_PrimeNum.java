package sept.Task;

import java.util.Scanner;

public class Task_25Sept_PrimeNum {

            public static void main(String[] args) {
                boolean isPrime = true;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number");
              int  num = sc.nextInt();
                if (num <= 1) {
                    System.out.println("Invalid Num");
                    return;
                }
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("number " + num + " is prime");
                } else {
                    System.out.println("number " + num + " is not prime");

                }

            }

        }

