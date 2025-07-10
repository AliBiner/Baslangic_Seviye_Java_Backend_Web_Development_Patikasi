package com.alibiner.TaxiMeter;


public class TaximeterCalculator {
    // Price per kilometer
    private final float kmPrice = 2.20f;

    // Minimum price for a taxi ride
    private final float minPrice = 20.00f;

    // Starting price (when you enter the taxi)
    private final float startPrice = 10.00f;

    // Welcome message for the user
    private final String welcomeText = "Taksimetre Hesaplama Uygulamasına Hoşgeldiniz.";

    // Custom scanner to read input from user, with welcome message
    private CustomScanner scanner = new CustomScanner(welcomeText);

    // This method starts the taximeter application
    public void start(){
        // Ask the user: 1 to calculate, 2 to exit
        int choice = scanner.getIntValueOnConsole("Hesaplama yapmak için 1'e , çıkış yapmak için 2'ye basınız.");

        // If the user chooses 1, start calculation
        if (choice ==1){
            // Ask user to enter the number of kilometers
            float distance = scanner.getFloatValueOnConsole("Kilometre bilgisi giriniz: ");

            // Print the final price based on the distance
            System.out.println("Ücret: " + calculatePrice(distance) + "TL");
        }
        // If the user did not choose 2, run the program again
        if (choice!=2)
            start();
    }

    // This method calculates the taxi price based on distance
    public float calculatePrice(float distance){
        // Start price + (distance * price per km)
        float price = startPrice + (distance * kmPrice);

        // Return the greater of calculated price or minimum price
        return Math.max(price, minPrice);
    }
}
