public class WaveForm {
    public static void Wave( int [][] arr ){
        int n = arr.length;
        int m = arr[0].length;

// Row Transformation

//        for ( int i = 0 ; i < n; i++){
//
//            if( i % 2 == 0 ){
//                for ( int j = 0 ; j < (m/2); j++){
//                    int temp = arr[i][j];
//                    arr[i][j] = arr[i][m-j-1];
//                    arr[i][m-j-1] = temp;
//                }
//            }
//
//        }

        // Column Transformation
        for ( int i = 0 ; i < n/2; i++){
                for ( int j = 0 ; j < m; j++){
                    if (j % 2 == 0) {
                        int temp = arr[n-i-1][j];
                        arr[n-i-1][j] = arr[i][j];
                        arr[i][j] = temp;
                    }

                }
            }

        }




    public static void main(String[] args) {
        int [][] arr = { { 1,2,3} , {4,5,6} , {6,7,8} , {6,7,8}};
        int n = arr.length;
        int m = arr[0].length;

        Wave(arr);
        System.out.println(" Original Matrix Is : ");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] +"   ");
            }
            System.out.println();
        }
    }
}
