package com.alibiner.TriangleAreaCalculator;

public class TriangleCalculator {
    // Create an object to read input from the user
    CustomScanner customScanner = new CustomScanner();

    // This method calculates the area of a triangle using 3 sides
    private double calculateAreaWithThreeSides(double[] sides){
        // Calculate the semi-perimeter (half of the perimeter)
        double semiPerimeter = (sides[0] + sides[1] + sides[2]) / 2;

        // Return the square root of the result (this is the area)
        return Math.sqrt(semiPerimeter * (semiPerimeter - sides[0]) * (semiPerimeter - sides[1]) * (semiPerimeter - sides[2]));
    }

    // This method starts the calculator
    public void start(){
        // Ask the user to choose: 1 to calculate area, 2 to exit
        int choice = customScanner.getIntValueOnConsole("Üç kenarı bilinen üçgenin alanını hesaplamak için 1'e, çıkış için 2'ye basınız.");
        // If user chooses 1, calculate the area
        if (choice == 1){
            // Create an array to store 3 side values
            double[] sides = new double[3];

            // Get values for all 3 sides from the user
            for (int i = 0; i < 3; i++) {
                sides[i] = customScanner.getDoubleValueOnConsole(i + 1 + ". kenarın değerini giriniz: ");
            }

            System.out.println("Kenarları " + sides[0] + " - " + sides[1] + " - " + sides[2] + " olan üçgenin alanı: " + calculateAreaWithThreeSides(sides));
            System.out.println();
        }

        // If the user does not choose 2 (exit), run the program again
        if (choice != 2)
            start();
    }

}
