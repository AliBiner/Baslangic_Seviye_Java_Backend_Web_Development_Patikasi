package com.alibiner.StudentInformationSystem;

public class Course {
    Teacher courseTeacher;
    String name, code, prefix;
    int verbalNoteImpact, examNoteImpact;
    int verbalNote, examNote;
    float averageNote;


    public Course(String name, String code, String prefix,int verbalNoteImpact, int examNoteImpact) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalNoteImpact = verbalNoteImpact;
        this.examNoteImpact = examNoteImpact;
        this.verbalNote = 0;
        this.examNote = 0;
    }

    public void addTeacher ( Teacher teacher)
    {
        if (this.prefix.equals(teacher.brach)){
            this.courseTeacher = teacher;
            System.out.println("İşlem Başarılı!");
        }else {
            System.out.println(teacher.name + " akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " dersinin " +
                    "Akademisyeni :" + courseTeacher.name );
        }else {
            System.out.println(this.name + " dersine " +
                    "akademisyen atanmamıştır.");
        }
    }

    public void calcNote(){
        if (verbalNote == 0 || examNote == 0)
            System.out.println("Dersin notları tam girilmemiştir.");
        else {
            this.averageNote = (float)
                    (((this.examNote * this.examNoteImpact) / 100) + ((this.verbalNote * this.verbalNoteImpact)/100));
        }
    }
}
