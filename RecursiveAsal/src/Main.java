import java.util.Scanner;

public class Main {
    static boolean isPrimeNumber(int a, int b) {

        if (b == 1) { //Sayı her zaman 1e bölünür.
            return true;
        }
        if (a % b == 0) {//Sayı kendi dışında başka bir sayıya bölünüyorsa false döner.
            return false;
        }
        return (isPrimeNumber(a, b - 1));
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Insert number: ");
            int a = scan.nextInt();

            boolean prime = isPrimeNumber(a, a - 1); //a sayısının kendisinin olmaması için a-1
            if (prime) {
                System.out.println(a + " is a Prime Number");
            } else {
                System.out.println(a + " is not a Prime Number");


            }
        }
    }
}