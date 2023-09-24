public class Main {
    public static void main(String[] args) {

       //Teacher sınıfında lecturer nesnelerini, nitelik bilgileri girerek tanımlıyoruz.
        Teacher lecturer1 = new Teacher("Yasemin", "EDB", "5523250205");
        Teacher lecturer2 = new Teacher("Nurşen", "FZK", "5543202634");
        Teacher lecturer3 = new Teacher("Aslı", "BIO", "5603604770");
        /*Bilgilerini yazdıralım.
        lecturer1.printTeacher();
        lecturer2.printTeacher();
        lecturer3.printTeacher();*/

        //Course sınıfında course nesnelerini, nitelik bilgilerini girerek tanımlıyoruz.
        Course edb = new Course("Edebiyat", "101", "EDB");
        edb.addTeacher(lecturer1);
        Course fzk = new Course("Fizik", "102", "FZK");
        fzk.addTeacher(lecturer2);
        Course bio = new Course("Biyoloji", "101", "BIO");
        bio.addTeacher(lecturer3);

        //Student sınıfında nesneleri getiriyoruz.
        Student s1 = new Student("Ayşe", "123","3", edb,fzk,bio);
        s1.addExamGrades(100,100,100);
        s1.addEvaluationGrade(100,100,90);
        s1.isPass();
    }
}