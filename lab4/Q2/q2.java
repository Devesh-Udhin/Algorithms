public class q2 {
    public static void main(String[] args) {        
        int[] arr = new int[6];

        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = (i+1); j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println("Duplicate is : " + arr[i]);
            }
        }
    }
}