public class Main { /* Palindrom sayı bir sayının tersten okunuşunun
aynı olmasıdır.*/

    //static metot tanımlayacağız.
    static boolean isPalindrome(int number) {
        int reversenumber=0, lastnumber, temp=number;

        while (temp!=0) {
            //reverseün ilk basamağı numberın son basamağıdır.
            lastnumber = temp % 10;

            reversenumber = (reversenumber * 10) + lastnumber;

            //temp integer olduğu için virgülden sonraki basamağı atıyor.
            temp /= 10;
        }
        if (number == reversenumber) {
            System.out.println(number + " bir Palindrome sayıdır.");
            return true;
        }
        else {
            System.out.println(number + " bir Palindrome sayı değildir.");
            return false;
        }


    }


    public static void main(String[] args) {

        System.out.println(isPalindrome(1001));

    }
}