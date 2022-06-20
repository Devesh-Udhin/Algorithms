import java.util.Random;

public class q6 {
    public static void main(String[] args) {
        middleElements(7, 7);
    }

    public static void middleElements(int row, int column) {

        int[][] myArray = new int[row][column];
        Random rand = new Random();

        //poupulating Array with random numbers
        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = rand.nextInt(10);
            }
        }
        
        for(int a = 0; a < myArray.length; a++) {
            for(int b = 0; b < myArray[a].length; b++) {
                System.out.print(myArray[a][b]+ "\t");
            }
            System.out.println();
        }

        int middleRow = (row/2);
        int middleColumn = (column/2);

        System.out.println();

        System.out.print("Middle row is : ");
        for(int p = 0; p < row; p++) {
            System.out.print(myArray[middleColumn][p] + "\t");
        }

        System.out.println();

        System.out.print("Middle column is : ");
        for(int q = 0; q < row; q++) {
            System.out.print(myArray[q][middleRow] + "\t");
        }

        System.out.println();

    }
}