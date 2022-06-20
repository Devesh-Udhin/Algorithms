public class q1 {
     public static void main(String[] args) {
         System.out.println(mult(4, 4));
     }

     public static int mult(int num1, int num2) {

          if(num2 == 1) {
               return num1;
          }
          else {
               return  num1 + mult(num1, num2-1);
          }
     }

}