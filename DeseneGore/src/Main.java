import java.util.Scanner;

public class Main {

    public static void pattern (int number, int initialNum) {

        //Sayının şu anki değerini yazar.
        System.out.println(number + " ");

        //Base case: Sayı <=0 ise sonlandır.
        if (number<=0) {
            return;
        }

        //Sayıya 5 ekleyip çıkaracağımız koşulları yazarız.
        if(number>0 && number<=initialNum) {
            pattern(number-5,initialNum);
        } else {
            pattern(number+5,initialNum);
        }
        System.out.println(number + " ");

    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Number: ");
        int number = scanner.nextInt();
        pattern(number,number);

    }
}