package com.alibiner.BMICalculator;


public class Calculator {
    // Welcome message shown to the user
    private final String welcomeText = "Vücut Kitle İndeksi Hesaplama Aracına Hoş Geldiniz.";
    // Scanner object to get input from the user, shows welcome message
    private final CustomScanner scanner = new CustomScanner(welcomeText);

    // This method starts the calculation process
    public void start(){
        // Ask user to choose: 1 for calculation, 2 for exit
        int choice = scanner.getIntFromConsole("Hesaplama için 1'e, çıkış için 2'ye basınız.");

        // If user chooses 1, continue with calculation
        if(choice ==1){
            //Get weight value from user (Only positive value)
            float inputWeight = scanner.getPositiveFloatFromConsole("Lütfen kilonuzu giriniz : ");

            //Get height value from user (Only positive value)
            float inputHeight = scanner.getPositiveFloatFromConsole("Lütfen boyunuzu (metre cinsinde) giriniz: " );
            System.out.println("Vücut Kitle İndeksiniz : " + calculate(inputHeight,inputWeight));
        }
        if(choice != 2)
            start();
    }

    // This method calculates the BMI (Body Mass Index)
    public double calculate(float height, float weight){
        return weight / (height * height);
    }
}
