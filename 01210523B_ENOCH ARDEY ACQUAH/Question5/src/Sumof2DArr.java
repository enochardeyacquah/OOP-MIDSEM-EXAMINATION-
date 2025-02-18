
public class Sumof2DArr{

    public static void main(String[] args){
        int [][] arr= new int[][] {{2,4,6,8}, {1,3,5,7}};

        System.out.println("Elements in 2D Array:");
        int sum=0;
        for(int i=0; i<4;i++){
            int sum2=0;
            for(int j=0; j<4;j++){
                sum += arr[i][j];
                sum2 += arr[i][j];

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

            System.out.println(sum2);
            System.out.println();
            System.out.println(sum);

        }

    }
}