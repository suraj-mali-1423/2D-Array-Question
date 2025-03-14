import com.sun.security.jgss.GSSUtil;

public class SpiralPrinting {
    public static void Print ( int [][] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] +"  ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static  void Spiral( int [][] arr ){
        int minr = 0 , minc = 0 , maxr = arr.length-1 , maxc = arr[0].length - 1;
        while ( minr <= maxr && minc <= maxc){

            // left to right
            for ( int j = minc ; j <= maxc ; j++){
                System.out.print(arr[minr][j]+"  ");
            }minr++;

            if (minr > maxr || minc > maxc) break;
            // top to bottom
            for (int i = minr ; i <= maxr ; i++ ){
                System.out.print(arr[i][maxc]+"  ");
            }maxc--;

            if (minr > maxr || minc > maxc) break;
            //right to left
            for ( int j = maxc ; j >= minc ; j--){
                System.out.print(arr[maxr][j]+"  ");
            }maxr--;

            if (minr > maxr || minc > maxc) break;
            // bottom to top
            for (int i = maxr ; i >= minr ; i-- ){
                System.out.print(arr[i][minc]+"  ");
            }minc++;

        }

    }
    public static void main(String[] args) {
        int [][] arr = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//        Print(arr);

        Spiral(arr);

    }
}
