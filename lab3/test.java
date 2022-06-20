// import java.util.ArrayList;
// import java.util.Random;
import java.util.Scanner;

public class test {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          int[] numarray = new int[10];

          // populating the array
           for(int j = 0; j < numarray.length; j++) {

               System.out.println("Enter number : ");
               numarray[j] = input.nextInt();

          }
          // displaying content of the array
          for(int numdisplay: numarray) {

               System.out.println(numdisplay);

          }
     }
}
