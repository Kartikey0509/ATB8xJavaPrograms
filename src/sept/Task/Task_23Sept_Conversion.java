package sept.Task;

import java.util.Scanner;

public class Task_23Sept_Conversion {
    public static void main(String[] args) {
     /*   Write a program that converts between different
    units (e.g., kilometers to miles, Celsius to Fahrenheit)
        based on user selection using a switch statement.
                Input. -
                choice - 1 - km → m, km → 1km
        choice - 2 - f → c, f → c*/

        int Fahrenheit, Celsius = 13;
        int km =10, m ;
        int choice;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the choice");
        choice= sc.nextInt();

        switch(choice){
            case 1:
                m =km*1000;
                System.out.println("Distance in meter is: "+m);
                break;
            case 2:
                Fahrenheit =((Celsius*9)/5)+32;
                System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);
                break;
            default:
                System.out.println("Wrong choice entered");
        }

        System.out.println("End of Loop");
    }
}
