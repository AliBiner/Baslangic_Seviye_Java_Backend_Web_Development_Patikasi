package com.alibiner.StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Matematik","MAT101","MAT",20,80);
        Course physic = new Course("Fizik", "FZK101","FZK",40,60);
        Course chemistry = new Course("Kimya","KMY101","KMY",50,50);

        Teacher teacher = new Teacher("Mahmut Hoca", "90550000000","MAT");
        Teacher teacher1 = new Teacher("Fatma Ayşe", "90550000001","FZK");
        Teacher teacher2 = new Teacher("Ali Veli", "90550000002","KMY");

        math.addTeacher(teacher);
        physic.addTeacher(teacher1);
        chemistry.addTeacher(teacher2);

        Student student = new Student("İnek Şaban", "140144015", 4 , math,physic,chemistry);
        student.addBulkExamNote(50,100,20,80,40,80);
        student.isPass();

        Student student1 = new Student("Güdük Necmi", "2211133", 4, math,physic,chemistry);
        student1.addBulkExamNote(100,50,50,80,40,50);
        student1.isPass();
    }
}
