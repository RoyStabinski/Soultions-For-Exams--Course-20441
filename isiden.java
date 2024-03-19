public class isiden {
    public static boolean isIdentity(int[][] mat, int x, int size) {

        return isIdentity(mat, x, x, x, size);
    }

    private static boolean isIdentity(int[][] mat, int i, int j, int x, int size) {

        if (i >= x + size || j > x + size || i > mat.length - 1 || j > mat[0].length - 1)
            return false;

        if (i == x + size - 1 && j == x + size - 1 && mat[i][j] == 1)
            return true;

        else if (i < x + size - 1) {
            if (mat[i][j] == 1 && i == j)
                return isIdentity(mat, i + 1, j, x, size);
            else if (mat[i][j] == 0 && i != j)
                return isIdentity(mat, i + 1, j, x, size);
        }
        else if (i == x + size - 1) {
            if (mat[i][j] == 1 && i == j)
                return isIdentity(mat, x, j + 1, x, size);
            else if (mat[i][j] == 0 && i != j)
                return isIdentity(mat, x, j + 1, x, size);
        }

        return false;

    }



    public static void main(String[] args){
        int[][] mat = new int[][]{{1,2,3,2,0,1,2},{0,1,0,0,0,3,0},{0,0,1,0,0,0,0},{5,0,0,1,0,0,0},{7,0,0,0,1,0,0},{8,0,0,0,0,1,0},{1,0,0,0,0,0,0}};
        System.out.println(isIdentity(mat,4,1));
    }
}
