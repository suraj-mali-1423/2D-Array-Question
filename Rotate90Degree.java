public class Rotate90Degree {
    public static void Rotate90Degree ( int [][]arr){
        int Row = arr.length; // Row
        int Col = arr[0].length; // Column

        // complete the Approach here
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < i; j++) { // Avoid the Diagonal Of the Matrix
                // In j =  i+0 ; i < ColSize ; j++ also working
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        // Reverse the give Array
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < (Row / 2); j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][Row - j - 1];
                arr[i][Row - j - 1] = temp;
            }
        }


    }
    public static void main(String[] args) {
        int [][] arr = { {1 ,2 , 3},{4,5,6}, {7,8,9}};

        Rotate90Degree(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] +"  ");
            }
            System.out.println();
        }


    }
}
