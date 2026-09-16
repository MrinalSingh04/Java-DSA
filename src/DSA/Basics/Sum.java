package DSA.Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");

        System.out.print("Please enter first no. : ");
        int firstNum = input.nextInt();

        System.out.print("Now please enter the second no. : ");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        System.out.println("DSA.Basics.Sum of your numbers is : " + sum);
    }
}
