import java.util.Random;

public class q5 {
    public static void main(String[] args) {
        upperHalf(10,10);
    }

    public static void upperHalf(int row, int column) {
        int[][] myArray = new int[row][column];
        Random rand = new Random();

        //poupulating Array with random numbers
        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = rand.nextInt(10);
            }
        }

        int count = row-1;
        
        for(int a = 0; a < myArray.length; a++) {
            for(int b = 0; b < myArray[a].length; b++) {
                System.out.print(myArray[a][b]+ "\t");
            }
            System.out.println();
        }

        System.out.println();
        
        for(int a = 0; a < myArray.length; a++) {
            for(int b = a; b < myArray[a].length; b++) {
                System.out.print(myArray[a][b]+ "\t");
            }
            System.out.println();
            for(int c = count; c < row; c++)
                System.out.print("\t");
            count--;
        }
    }

}