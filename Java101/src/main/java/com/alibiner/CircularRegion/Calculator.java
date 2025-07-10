package com.alibiner.CircularRegion;


public class Calculator {
    // Welcome message shown to the user
    private final String welcomeText = "Daire Hesaplama Aracına Hoş Geldiniz." ;

    // Scanner object to get input from the user, shows welcome message
    CustomScanner scanner = new CustomScanner(welcomeText);

    // This method starts the calculation process
    public void start(){

        // Ask user to choose: 1 for calculation, 2 for exit
        int choice = scanner.getIntValueOnConsole("Hesaplama için 1'e basınız. Çıkış için 2'ye basınız.");

        // If user chooses 1, continue with calculation
        if (choice==1) {
            // Get radius value from user
            double radius = scanner.getDoubleValueOnConsole("Yarıçap değeri giriniz: ");
            // Get central angle value from user
            double centralAngleDegrees = scanner.getDoubleValueOnConsole("Merkez açının ölçüsünü giriniz: ");

            // Check if input values are valid
            while (!isTrueValuesForCalculate(radius,centralAngleDegrees)){
                // Show error message if inputs are wrong
                System.out.println("Hatalı giriş! Yarıçap 0'dan büyük olmalı, Merkez açı 0 ile 360 arasında olmalıdır!");
                // Ask again for radius and central angle
                radius = scanner.getDoubleValueOnConsole("Yarıçap değeri giriniz: ");
                centralAngleDegrees = scanner.getDoubleValueOnConsole("Merkez açının ölçüsünü giriniz: ");
            }
            System.out.println("Sonuç = " + calculateSectorArea(radius,centralAngleDegrees));
            System.out.println("-------------");
            System.out.println();
        }

        // If user did not choose 2 (exit), restart the program
        if(choice!=2)
            start();
    }

    // This method calculates the area of a circle sector
    public double calculateSectorArea(double radius, double centralAngleDegrees){
        // Formula: (pi * r^2 * angle) / 360
        return (Math.PI * (radius * radius) * centralAngleDegrees ) / 360;
    }

    // This method checks if the radius and angle are valid for calculation
    public boolean isTrueValuesForCalculate( double radius, double centralAngleDegrees){
        // Radius must be > 0, angle must be between 0 and 360 (not included 0)
        return radius > 0 && centralAngleDegrees <= 360 && centralAngleDegrees > 0;
    }

}
