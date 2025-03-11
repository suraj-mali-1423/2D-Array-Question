public class Check90DegreeMatrixWithTarget {
    public static void Rotate90Degree ( int [][] arr){
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
    public static boolean isEqual( int [][] arr , int [][] target){
           int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 if (arr[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    public static boolean FindRotation( int [][] arr , int [][] target ){
         int n = arr.length;

         if (isEqual(arr, target)) return true;

         // Rotate the 90 , 180 , 270 Degree
         for ( int i = 0 ; i < 3; i++ ){
             Rotate90Degree(arr);
             if(isEqual(arr, target)) return true;
         }
         return false;
    }
    public static void main(String[] args) {
        int [][] arr = { {0,1},{1,0}};

        int [][] target = {{1,0},{1,1}};

        System.out.print(" This Is Two matrix Equal : "+FindRotation(arr,target));


    }
}
