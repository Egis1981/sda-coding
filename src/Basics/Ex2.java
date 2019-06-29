package Basics;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your decimal number: ");
        double input = sc.nextDouble();
        System.out.printf("Your rounded number is: %.2f ", input);
    }
}