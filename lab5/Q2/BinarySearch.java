public class BinarySearch {
    public static void main(String[] args) {
        int[] myArr = new int[10];

        myArr[0] = 1;
        myArr[1] = 2;
        myArr[2] = 3;
        myArr[3] = 4;
        myArr[4] = 5;
        myArr[5] = 6;
        myArr[6] = 7;
        myArr[7] = 8;
        myArr[8] = 9;
        myArr[9] = 10;

     //    System.out.println(binarySearch(myArr, 8 ));

    }
    //alternative to binary search
    // static int count = 0;
    // public static int binarySearch(int[] myArray, int searchKey) {
        
    //     if(myArray[count] == searchKey) {
    //         return myArray[count];
    //     }

    //     else {
    //         count++;
    //         return binarySearch(myArray, searchKey);
    //     }

    // } 
//     private static int binarySearch(int[] myArray, int searchKey, int start, int end) {
//         int halfIndex = start + (end - start)/2;

//         if(start > end) {
//             return -1;
//         }

//         if(myArray[halfIndex] == searchKey) {
//             return halfIndex;
//         }
//         else if(myArray[halfIndex] < searchKey) {
//             return binarySearch(myArray, searchKey, halfIndex+1, end);
//         }
//         else {
//             return binarySearch(myArray, searchKey, end, halfIndex+1);
//         }

//     }

     // static int start = 0, end = ;
          
     // public static int binarySearch(int myArr[], int searchKey) {

     //      int halfIndex = ((myArr[myArr.length-1] - myArr[0])/2) + 1;
          
     //      if(myArr[halfIndex] == searchKey) {
     //           return myArr[halfIndex];
     //      } 
     //      else if(searchKey < myArr[halfIndex]) {
     //           int end = myArr.length-1;
     //           myArr[end] = myArr[halfIndex];
     //           myArr[halfIndex] = (myArr[end] -  myArr[0])/2;

     //           return binarySearch(myArr, searchKey);
     //      }
     //      else {
     //           int halfIndex = ((myArr[myArr.length-1] - myArr[0])/2) + 1;
     //           myArr[start] =  myArr[halfIndex];
     //           myArr[halfIndex] = (myArr[end] -  myArr[start])/2;

     //           return binarySearch(myArr, searchKey);
     //      }

     // }

}
