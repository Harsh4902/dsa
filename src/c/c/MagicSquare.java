package c.c;

public class MagicSquare {

    static boolean isMagicSquare(int mat[][],int n)
    {
        int sumd1 = 0,sumd2=0;
        for (int i = 0; i < n; i++)
        {
            sumd1 += mat[i][i];
            sumd2 += mat[i][n-1-i];
        }
        if(sumd1!=sumd2)
            return false;
        for (int i = 0; i < n; i++) {

            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++)
            {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 3;

        int mat[][] = {{ 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }};

        if (isMagicSquare(mat,3))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic" +
                    " Square");

    }

}
