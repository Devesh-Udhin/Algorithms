public class q3 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        arr[0] = 8;
        arr[1] = 7;
        arr[2] = 2;
        arr[3] = 5;
        arr[4] = 3;
        arr[5] = 1;
        
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count++;
            for(int j = count; j < arr.length; j++) {
                // if((arr[i] == arr[j])) {
                //     continue;
                // }
                /* else*/ if(arr[i] + arr[j] == 10) {
                    System.out.println("Pair found at indices " + i + " and " + j + " (" + arr[i] + "+" + arr[j] + ")");
                }
            }
        }

    }
}