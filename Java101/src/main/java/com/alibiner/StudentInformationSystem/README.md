# Öğrenci Not Sistemi

### Course Sınıfı Özellikleri :

- Nitelikler : name,code,prefix,note,Teacher
- Metotlar : Course() , addTeacher() , printTeacher()

### Teacher Sınıfı Özellikleri :

- Nitelikler : name,mpno,branch
- Metotlar : Teacher()

### Student Sınıfı Özellikleri :

- Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
- Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

# Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

### Yaptığım değişiklikler:

Course sınıfına eklenen nitelikler (variable):
- verbalNoteImpact (sözlü not etkisi)
- examNoteImpact (sınav not etkisi)
- verbalNote (Sözlü Notu) 
- examNote (Sınav Notu)
- averageNote (Sözlü ve sınavın ortalaması)

Course sınıfına eklenen calcNote Method'u:

      public void calcNote(){
          if (verbalNote == 0 || examNote == 0)
            System.out.println("Dersin notları tam girilmemiştir.");
          else {
            this.averageNote = (float)
            (((this.examNote * this.examNoteImpact) / 100) + ((this.verbalNote * this.verbalNoteImpact)/100));
          }
      }

Course sınıfının yenilen Constructor'u:

    public Course(String name, String code, String prefix,int verbalNoteImpact, int examNoteImpact) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalNoteImpact = verbalNoteImpact;
        this.examNoteImpact = examNoteImpact;
        this.verbalNote = 0;
        this.examNote = 0;
    }



Student sınıfının yenilen calcAvarage method'u:

    public void calcAverage(){
        this.mat.calcNote();
        this.physic.calcNote();
        this.chemistry.calcNote();
        this.average = (double) (this.mat.averageNote + this.physic.averageNote + this.chemistry.averageNote) / 3;
    }

Student sınıfının yenilen addBulkExamNote method'u:

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

Student sınıfının yenilenen printNote method'u:

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