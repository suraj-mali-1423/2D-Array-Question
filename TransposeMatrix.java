public class TransposeMatrix {
    public static int[][] Transpose ( int [][]arr){
        int Row = arr.length; // Row
        int Col = arr[0].length; // Column

        int [][] Help = new int [Col][Row]; // Helper 2D Array

        // complete the Approach here
        for (int i = 0; i < Col; i++) {
            for (int j = 0; j < Row; j++) {
                Help[i][j] = arr[j][i];
            }
        }

        return Help;
    }
    public static void main(String[] args) {
        int [][] arr = { {1 ,2,3},{4,5,6}, {7,8,9}};

        Transpose(arr);

        int [][] Result = Transpose(arr);

        for (int i = 0; i < Result.length; i++) {
            for (int j = 0; j < Result[0].length; j++) {
                System.out.print(Result[i][j] +"  ");
            }
            System.out.println();
        }

    }
}
