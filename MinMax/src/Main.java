import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner input = new Scanner(System.in);
        System.out.println("Insert number: ");
        int usernumber = input.nextInt();

        int maxnclosest = list [0];
        int minnclosest = list [0];


        for (int i : list) {
            if (i > usernumber) {
                int x = maxnclosest - usernumber;
                int y = i - usernumber;
                if (y < x || maxnclosest < usernumber) {
                    maxnclosest = i;
                }
            } else {
                int x = usernumber - minnclosest;
                int y = usernumber - i;
                if (y < x || minnclosest > usernumber) {
                    minnclosest = i;
                }
            }
        }
        System.out.println("Bigger number is: " + maxnclosest);
        System.out.println("Smaller number is: " + minnclosest);

    }
}