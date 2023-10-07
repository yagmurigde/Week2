import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        int arrayLength = scan.nextInt();

        int [] list = new int[arrayLength];
        System.out.println("Insert number: ");
        for(int i = 0; i < arrayLength; i++) {
            System.out.print((i +1) + ". input: ");
            int input = scan.nextInt();
            list[i] = input;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}