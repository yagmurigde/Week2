import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] b = new String[5][3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (i == 0 || i == 2 || i==4) {
                    b[i][j] = " *";
                } else if (j == 0 || j==2) {
                    b[i][j] = " *";
                } else {
                    b[i][j] = "  ";
                }
            }
        }

        for (String[] row : b) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}