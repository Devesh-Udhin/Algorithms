import java.util.ArrayList;
import java.util.Scanner;

public class q2 {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          ArrayList<Integer> myarray = new ArrayList<>();

          do {

               System.out.println("Enter your positive number to populate the array(enter a 0 to stop the input) :");
               myarray.add(new Integer(input.nextInt()));

          }while(input.nextInt() != 0); 

          // int j = 0;
          int x = 0;
          for(int i =0; i < myarray.size(); i++) {

               for(int j = 0; j < myarray.size(); j++) {

                    while(( myarray.get(i) != myarray.get(j) ) && (j < myarray.size())) {
                         x = myarray.get(i+1);
                         x *= myarray.get(j);
                    }

               }

     }
}
