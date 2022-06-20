public class activity {
     public static void main(String[] args) {

          // System.out.println(recursiveSum(5));

          // System.out.println(recursivePower(3, 5));

          // int[] arr = {3,15,6,2,8,14,8};
          // System.out.println(findMaxNum(arr, arr.length));

     }

     public static int recursiveSum(int num) {
          if(num == 1) {
               return 1;
          }
          else {
               return num + recursiveSum(num - 1);
          }
     }

     public static int recursivePower(int num, int pow) {
          if(pow == 0) {
               return 1;
          }
          else {
               return num * recursivePower(num, pow - 1);
          }
     }

     // program to return max number in an array using recursion
     public static int findMaxNum(int[] arr, int lengthOfArray) {
          if(lengthOfArray == 1) {
               return arr[0];
          }
          else {
               return Math.max(arr[lengthOfArray-1], findMaxNum(arr, lengthOfArray - 1));
          }
     }

}