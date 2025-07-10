package com.alibiner.GPACalculator;

import java.util.List;

public class GPACalculator {
    // This method calculates average score of lessons
    public static float averageCalculator(List<Lesson> lessons){
        int scoreSum = 0;
        for(Lesson lesson : lessons){
            scoreSum += lesson.getScore(); // add all scores
        }
        return (float) scoreSum / lessons.size(); // return average
    }
}
