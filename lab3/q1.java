// import java.util.ArrayList;
// import java.util.Random;
import java.util.Scanner;

public class q1 {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          // Random rand = new Random();

          int[] numarray = new int[10];
          int[] count = new int[10];
          int majorityElement = 0;

          // ArrayList<Integer> countList = new ArrayList<>();

          // for(int i = 0; i < numarray.length; i++) {

          //      numarray[i] = rand.nextInt(10);

          // }
          // populating the array
           for(int j = 0; j < numarray.length; j++) {

               System.out.println("Enter number : ");
               numarray[j] = input.nextInt();

          }
          // displaying content of the array
          for(int numdisplay: numarray) {

               System.out.println(numdisplay);

          }

          int m = 0;
          // counting number of occurrence of each elements
          for(int num: numarray) {

               for(int k = 0; k < numarray.length; k++) {

                    if(numarray[k]==num){
                         count[m] += 1;
                    }

               }

               m++;

          }

          int largest = count[0];
          // int smallest = count[0];
          // finding the largest occurrence and display the num respectively according to array index position
          for (int x = 0; x < count.length; x++) {

               if(count[x] > largest){
                    largest = count[x];
                    majorityElement = numarray[x];
               }

          }

          System.out.println("Majority Element is : "+majorityElement);

     }

}