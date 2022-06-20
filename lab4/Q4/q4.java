public class q4 {
    public static void main(String[] args) {
        int[] arr = new int[7];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;

        int lastElement = arr.length-1;
        int temp = 0;
        for(int i = 0; i < (arr.length/2); i++) {
            temp = arr[i];
            arr[i] = arr[lastElement];
            arr[lastElement] = temp;
            lastElement--;
        }

        for(int num : arr) {
            System.out.print(num+"\t");
        }
    }
}