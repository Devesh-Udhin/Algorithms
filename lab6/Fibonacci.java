public class Fibonacci {
     final int max = 10000;
     int[] fib = new int[max];
 
     int fibonacci(int num) {
         if (num == 0) return 0;
         if (num == 1) return 1;
 
         if (fib[num] != 0) {
             return fib[num];    
         }
         fib[num] = fibonacci(num - 1) + fibonacci(num - 2);  
         return fib[num];
     }
 }