import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("What is the width of the room in feet? ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("You entered the dimensions %s feet by %s feet.", length, width));

        final double f2tom2 = 0.09290304;
        int area_feet = length * width;
        double area_meters = (area_feet * f2tom2);

        System.out.println(String.format("The area is:\n%s square feet\n%.3f square meters.",
                area_feet, area_meters));
    }
}
