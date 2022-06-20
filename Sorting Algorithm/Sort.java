public class Sort {
     public static void main(String[] args) {

          int myArray[] = new int[] {5, 3, 4, 7, 2, 8, 6, 9, 1};
          // int myArray[] = new int[] {10, 5, 7};

          myArray = InsertionSort(myArray);

          for(int i = 0; i < myArray.length; i++){
               System.out.print(myArray[i] + " ");
          }

     }

     public static int[] BubbleSort(int arr[]) {

          int n = arr.length;

          for(int i = 0; i < (n-1); i++) {
               for(int j = 0; j < (n-i-1); j++) {
                    if(arr[j] > arr[j+1]) {
                         arr[j] += arr[j+1];
                         arr[j+1] = arr[j] - arr[j+1];
                         arr[j] -= arr[j+1];
                    }
               }
          }

          return arr;

     }

     public static int[] SelectionSort(int arr[]) {

          int smallest,temp, valueSwap = 0;

          for(int i = 0; i < (arr.length); i++) {
               smallest = Integer.MAX_VALUE;
               for(int j = i; j < (arr.length); j++) {
                    if(arr[j] < smallest) {
                         smallest = arr[j];
                         valueSwap = j;
                    }
               }
               temp = arr[i];
               arr[i] = smallest;
               arr[valueSwap] = temp;
          }

          return arr;
     }

     public static int[] InsertionSort(int arr[]) {

          int temp = 0;

          for(int i = 1; i < arr.length; i++) {
               for(int j = i; j >= 1; j--) {
                    if(arr[j] < arr[j-1]) {
                         temp = arr[j];
                         arr[j] = arr[j-1];
                         arr[j-1] = temp;
                    }
               }
          }

          return arr;
     }

}