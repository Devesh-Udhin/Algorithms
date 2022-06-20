public class q2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] proArr =new int[5];
        
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int product = 1;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    continue;
                }
                else {
                    product *= arr[j];
                }

            }
            proArr[i] = product;
            product = 1;
        }

        for(int num: proArr) {
            System.out.print(num + "\t");
        }

        System.out.print("\n");

    }
}