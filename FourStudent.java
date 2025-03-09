import java.util.Scanner;

public class FourStudent {
    public static void main(String[] args) {
         int [][] arr = new int [4][2];
        Scanner Sc  = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }

        System.out.println(" This is the Student mark with side b side roll number: ");
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
