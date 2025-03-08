import java.util.Scanner;

public class LagestNumber {
    public static int  LargestNumber (int [] [] arr){
         int n = arr.length;
         int m =arr[0].length;
         int Max = Integer.MIN_VALUE;
         for ( int i = 0 ; i < n; i++){
             for (int j = 0; j < m; j++) {
                 if (arr[i][j] > Max) Max = arr[i][j];
             }
         }

         return Max;

    }
    public static void main(String[] args) {
        int [][] arr = new int [3][3];
        Scanner Sc  = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }

        int Result = LargestNumber(arr);
        System.out.print(" The Largest Element i the give  2D Array is : "+Result);

    }
}
