public class Main {
    public static void main (String[] args)
    {
        int[][] A = {
                {2 , 3 , 4} ,
                {4 , 5 , 6}
        };

        int[][] aTranspose = new int[A[0].length][A.length];

        for ( int i = 0;i < A[0].length;i++ ) {
            for ( int j = 0;j < A.length;j++ ) {
                aTranspose[i][j] = A[j][i];
            }
        }
        for ( int i = 0;i < aTranspose.length;i++ ) {
            for ( int j = 0;j < aTranspose[0].length;j++ ) {
                System.out.print (aTranspose[i][j] + " ");
            }
            System.out.println ();
        }
    }
}