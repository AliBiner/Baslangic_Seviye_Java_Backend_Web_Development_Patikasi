package com.alibiner.GPACalculator2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String welcomeText =  "Not Ortalaması Aracına Hoş Geldiniz.";
        CustomScanner scanner = new CustomScanner(welcomeText);

        byte passingGrade = 55;

        byte outCalculationLessonCount = 0;

        byte math = scanner.getByteFromConsole("Matematik notunuz: ");
        if (math<0 || math>100){
            ++outCalculationLessonCount;
            math = 0;
        }

        byte physic = scanner.getByteFromConsole("Fizik notunuz: ");
        if (physic<0 || physic>100){
            ++outCalculationLessonCount;
            physic = 0;
        }

        byte turkish = scanner.getByteFromConsole("Türkçe notunuz: ");
        if (turkish<0 || turkish>100){
            ++outCalculationLessonCount;
            turkish = 0;
        }

        byte chemistry = scanner.getByteFromConsole("Kimya notunuz: ");
        if (chemistry<0 || chemistry>100){
            ++outCalculationLessonCount;
            chemistry = 0;
        }

        byte music = scanner.getByteFromConsole("Müzik notunuz: ");
        if (music<0 || music>100){
            ++outCalculationLessonCount;
            music = 0;
        }

        short sumScore = (short) (math + physic + turkish + chemistry + music);
        float gpa = (float) sumScore / (5-outCalculationLessonCount);
        System.out.println( "Not Ortalaması: " + gpa + (gpa<passingGrade ? " Kaldı" : " Geçti"));
    }
}
