package com.alibiner.StudentInformationSystem;

public class Student {
    String name, stuNo;
    int classes;
    Course mat, physic, chemistry;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course mat, Course physic, Course chemistry) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.physic = physic;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void calcAverage(){
        this.mat.calcNote();
        this.physic.calcNote();
        this.chemistry.calcNote();
        this.average = (double) (this.mat.averageNote + this.physic.averageNote + this.chemistry.averageNote) / 3;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void addBulkExamNote(int mathVerbalNote, int mathExamNote, int physicVerbalNote, int physicExamNote,
                                int chemistryVerbalNote, int chemistryExamNote){
        if (mathVerbalNote>= 0 && mathVerbalNote<=100)
            this.mat.verbalNote = mathVerbalNote;
        if (mathExamNote>=0 && mathExamNote<=100)
            this.mat.examNote = mathExamNote;
        if (physicVerbalNote >= 0 && physicVerbalNote<=100)
            this.physic.verbalNote = physicVerbalNote;
        if (physicExamNote>=0 && physicExamNote<=100)
            this.physic.examNote = physicExamNote;
        if (chemistryVerbalNote>=0 && chemistryVerbalNote <= 100)
            this.chemistry.verbalNote = chemistryVerbalNote;
        if (chemistryExamNote>=0 && chemistryExamNote<=100)
            this.chemistry.examNote = chemistryExamNote;

    }
    public void isPass(){
        if (this.mat.verbalNote == 0 || this.mat.examNote == 0 || this.physic.verbalNote == 0 || this.physic.examNote == 0 || this.chemistry.verbalNote == 0 || this.chemistry.examNote == 0)
            System.out.println("Notlar tam olarak girilmemiş");
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.average);
            if (this.isPass)
                System.out.println("Sınıfı geçti.");
            else
                System.out.println("Sınıfta kaldı.");
        }

    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sözlü Notu : " + this.mat.verbalNote);
        System.out.println("Matematik Sınav Notu : " + this.mat.examNote);
        System.out.println("Matematik Not Ortalaması : " + this.mat.averageNote);
        System.out.println("Fizik Sözlü Notu : " + this.physic.verbalNote);
        System.out.println("Fizik Sınav Notu : " + this.physic.examNote);
        System.out.println("Fizik Not Ortalaması : " + this.physic.averageNote);
        System.out.println("Kimya Sözlü Notu : " + this.chemistry.verbalNote);
        System.out.println("Kimya Sınav Notu : " + this.chemistry.examNote);
        System.out.println("Kimya Not Ortalaması : " + this.chemistry.averageNote);
    }
}
