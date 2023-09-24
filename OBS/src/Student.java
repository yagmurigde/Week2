public class Student {
    //Sınıfa ait nitelikleri yazarak başlıyoruz. (name,stuNo,classes,averageGPA,course1,course2,course3)
    String name;
    String stuNo;
    String classes;
    double averageGPA;
    Course c1;
    Course c2;
    Course c3;
    boolean isPass;

    //Sınıfa ait kurucu metodu yazıyoruz.
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        double averageGPA = 0.0;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
    }

    //Sınavdan alınan notları alıyoruz ve ilgili ders için yüzdelik dilimi belirliyoruz.
    void addExamGrades(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.examGrade = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.examGrade = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.examGrade = note3;
        }
    }

    //Değerlendirme notlarını ekliyoruz.
    void addEvaluationGrade(int eva1, int eva2, int eva3) {
        if (eva1 >= 0 && eva1 <= 100) {
            this.c1.evaluation = eva1;
        }
        if (eva2 >= 0 && eva2 <= 100) {
            this.c2.evaluation = eva2;
        }
        if (eva3 >= 0 && eva3 <= 100) {
            this.c3.evaluation = eva3;
        }
    }


    //Geçti-Kaldı koşulunu yazıyoruz.
    void isPass () {
        this.averageGPA = (this.c1.examGrade * 0.8 + this.c2.examGrade * 0.65 + this.c3.examGrade* 0.75
        + this.c1.evaluation * 0.2 + this.c2.evaluation * 0.35 + this.c3.evaluation * 0.25) / 3.0 ;

        if (this.averageGPA >= 55) {
            System.out.println("Sınıfı geçtiniz.");
        }
        else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
