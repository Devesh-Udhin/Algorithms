import java.util.Scanner;

public class q1 {
        public static void main(String[] args) {

               //  Scanner input = new Scanner(System.in);

               //  int nth_Term;

               //  System.out.print("Enter the nth term of the fibonacci number you want to know : ");
               //  nth_Term = input.nextInt();

               //  int ans = DynamicFibo(nth_Term);

               //  System.out.println("The " + nth_Term + "th term of the fibonacci sequence is : " + ans);

               //  input.close();

               Fibonacci f = new Fibonacci();

               System.out.println( f.fibonacci(6));
        }

        public static int RecurssiveFibo(int num) {
                if(num == 0) {
                        return 0;
                }
                else if(num == 1) {
                        return 1;
                }
                else {
                        return RecurssiveFibo(num - 1) + RecurssiveFibo(num - 2);
                }
        }
        
        public static int DynamicFibo(int num) {

          if(num == 0 || num == 1) {
               return num;
          }
                int sum = 0;

                int f1 = 0;
                int f2 = 1;

                for(int i = 2; i <= num; i++) {
                    sum = f1 + f2;
                    f1 = f2;
                    f2 = sum;
                }

                return sum;

        }

}