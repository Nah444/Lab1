package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Grand Circus Room Detail Generator!");

        double length;
        double width;
        double area;
        double perimeter;
        String answer = "yes";


            System.out.println("Enter Length: ");
            length = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter Width: ");
            width = scan.nextDouble();
            scan.nextLine();

            area = length * width;
            System.out.println("Area: " + area);

            perimeter = 2 * (length + width);
            System.out.println("Perimeter" + perimeter);

            System.out.println("Press yes to continue");
            answer = scan.nextLine();





    }
}
