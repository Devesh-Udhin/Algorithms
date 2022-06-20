public class q5 {
    public static void main(String[] args) {
        int[] arr = new int[7];

        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 10;
        arr[3] = 9;
        arr[4] = 1;
        arr[5] = 4;
        arr[6] = 5;
        
        System.out.println(smallestInt(arr, 0, arr.length));
    }
    static int smallest = Integer.MAX_VALUE, i = 1;
    public static int smallestInt(int[] myArray, int start, int end) {
        
        if(myArray[i-1] < smallest) {
            smallest = myArray[i-1];
        }
        if((i-1) == myArray.length-1) {
            return smallest;
        }
        else {
            i++;
            return smallestInt(myArray, (myArray.length-myArray.length-i), end);
            
        }

    }

}