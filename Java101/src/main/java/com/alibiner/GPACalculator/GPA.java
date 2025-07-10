package com.alibiner.GPACalculator;

import java.util.ArrayList;
import java.util.List;

public class GPA {
    public static void main(String[] args){
        // Create lesson list
        List<Lesson> lessonList = new ArrayList<>();
        lessonList = createLessons(lessonList);

        // Ask user to enter scores for each lesson
        lessonList = getLessonScoreOnConsole(lessonList);

        // Calculate average
        float averageScore = GPACalculator.averageCalculator(lessonList);

        // Check if average is enough to pass
        String result = averageScore < 60 ? "Kaldı" : "Geçti";

        System.out.println(result);// print result
    }

    // This method creates lesson list without scores
    public static List<Lesson> createLessons(List<Lesson> lessonList){
        lessonList.add(new Lesson("Matematik"));
        lessonList.add(new Lesson("Fizik"));
        lessonList.add(new Lesson("Kimya"));
        lessonList.add(new Lesson("Türkçe"));
        lessonList.add(new Lesson("Tarih"));
        lessonList.add(new Lesson("Müzik"));
        return lessonList;
    };

    // This method gets score for each lesson from user
    public static List<Lesson> getLessonScoreOnConsole(List<Lesson> lessons){
        for (Lesson lesson: lessons){
            // Ask score
            lesson.setScore(OnConsole.getIntValueOnConsole(lesson.getName(),"dersinin notunu giriniz(0-100): "));

            // Check if score is valid (0-100)
            while (lesson.getScore()<0 || lesson.getScore()>100){
                System.out.println("Geçersiz bir not girdiniz. Lütfen 0-100 arasında bir değer giriniz: ");
                lesson.setScore(OnConsole.getIntValueOnConsole(lesson.getName(),"dersinin notunu giriniz(0-100): "));
            }
        }
        return lessons;
    };

}
