public class RecursionForMult {
    public static void main(String[] args) {
        System.out.println(mult(14, 0));
    }
    static int count = 0;
    public static int mult(int num1, int num2) {
        count++;        

        if(count >= num2) {
            return num1;
        }
        else {
            return num1 + mult(num1, num2);
        }
    }

     public static int RecursiveMult(int num1, int num2) {

          if(num2 == 0) {
               return 0;
          }
          else if(num2 == 1) {
               return num1;
          }
          else {
               return num1 + RecursiveMult(num1, num2 - 1);
          }
     }

}