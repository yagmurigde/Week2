import java.util.Scanner;

public class Main {
    static int number (int base, int exp) {

        if (exp == 0) {//Üs sıfır olursa 1 verecek
            return 1;}
        else if (exp==1) {//Üs 1 olursa kendisini verecek
            return base;}
        else { //Üs sıfır veya 1den farklı ise recursivede kendiyle çarpılarak döndürecek
                int result = number(base, exp-1);
                return result*base;
            }
        }
    
    
    
    public static void main(String[] args) {
        int base, exp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert base: ");
        base = scan.nextInt();
        System.out.print("Insert exponent: ");
        exp = scan.nextInt();

        System.out.println("Result: " + number(base, exp));

        }
}
