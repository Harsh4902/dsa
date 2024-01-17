package c;

public class UpperTriangular {

    public static boolean isUpperTriangularMatrix(int mat[][],int m)
    {
        for (int i = 1; i < m ; i++)
            for (int j = 0; j < i; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int m = 4;
        int n = 4;

        int[][] mat= { { 1, 3, 5, 3 },
                { 0, 4, 6, 2 },
                { 0, 0, 2, 5 },
                { 0, 0, 0, 6 } };

        if(isUpperTriangularMatrix(mat,m))
            System.out.println("Given matrix is Upper triangular matrix.");
        else
            System.out.println("Given matrix is not Upper triangular matrix.");
    }

}
