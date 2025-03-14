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

    public static  int [][] Spiral( int n ){
        int minr = 0 , minc = 0 , maxr = n-1 , maxc = n - 1;
        int [][] arr = new int [n][n];
        int cnt = 1 ;
        while ( minr <= maxr && minc <= maxc){

            // left to right
            for ( int j = minc ; j <= maxc ; j++){
                arr[minr][j] = cnt++;
            }minr++;

            if (minr > maxr || minc > maxc) break;
            // top to bottom
            for (int i = minr ; i <= maxr ; i++ ){
               arr[i][maxc] = cnt++;
            }maxc--;

            if (minr > maxr || minc > maxc) break;
            //right to left
            for ( int j = maxc ; j >= minc ; j--){
                arr[maxr][j] = cnt++;
            }maxr--;

            if (minr > maxr || minc > maxc) break;
            // bottom to top
            for (int i = maxr ; i >= minr ; i-- ){
               arr[i][minc] = cnt++;
            }minc++;

        }
        return arr;
    }
    public static void main(String[] args) {


        int [][] arr = Spiral(4);
        Print(arr);


    }
}
