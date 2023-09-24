public class Teacher {
    //Sınıfa ait nitelikleri yazarak başlıyoruz. (name,mpno,branch)
    String name;
    String mpno;
    String branch;

    //Sınıfa ait kurucu metodu yazıyoruz.
    Teacher (String name, String branch, String mpno) {

        //Metot parametrelerini sınıftakiyle eşliyoruz.
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    //Burada öğretmen bilgilerini yazdırmak için bir metot tanımlayalım.
    void printTeacher() {
        System.out.println("Öğretmen adı:\t" + this.name);
        System.out.println("Branş:\t" + this.branch);
        System.out.println("Telefon numarası:\t" + this.mpno);
    }

}
