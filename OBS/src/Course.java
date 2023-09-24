public class Course {
    //Sınıfa ait nitelikleri yazarak başlıyoruz. (name,code,prefix,examGrade,evaluation,Teacher)
    String name;
    String code;
    String prefix;
    int examGrade;
    int evaluation;
    Teacher lecturer; //Teacher sınıfından lecturer nesnesini getirir.

    //Sınıfa ait kurucu metodu yazıyoruz.
    Course(String name, String code, String prefix) {

        //Metot parametrelerini sınıftakiyle eşliyoruz.
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int examGrade = 0;
        int evaluation = 0;

    }

    /*Teacher sınıfındaki nesneleri void metoduyla Course sınıfındaki nesnelere
    atayacağız böylelikle ders ve öğretmen eşleşmiş olacak.*/
    void addTeacher(Teacher lecturer) {
        if (lecturer.branch.equals(this.prefix)) {
            this.lecturer = lecturer;
            this.lecturer.printTeacher();
        } else {
            System.out.println("Ders ve dersi veren öğretmen bilgisi uyuşmuyor.");
        }

    }
}
