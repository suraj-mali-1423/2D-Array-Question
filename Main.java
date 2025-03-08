import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Take input from the user
        int [][] arr = new int [3][3];
        Scanner Sc  = new Scanner(System.in);

        System.out.println(" Enter the 2D Array Element : ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }

        System.out.println(" Print the 2D Array Element : ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
