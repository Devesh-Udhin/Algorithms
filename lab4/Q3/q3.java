import java.util.ArrayList;

public class q3 {
    public static void main(String[] args) {
        int[] arr = new int[9];

        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 2;
        arr[4] = 0;
        arr[5] = 4;
        arr[6] = 2;
        arr[7] = 4;
        arr[8] = 5;

        ArrayList<Integer> newArray = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            for(int j = (i+1); j < arr.length; j++) {
                if(arr[i] == arr[j])
                    newArray.add(j);
            }
            // newArray.add(arr[i]);
        }

        boolean isIndexCorrect = true;

        // int[] arraySingleNumber = new int[(arr.length - newArray.size())]; 
        ArrayList<Integer> arraySingleNumber = new ArrayList<>(); 

        for(int z = 0; z < arr.length; z++) {
            for(int x = 0; x < newArray.size(); x++) {
                if(z == newArray.get(x)) {
                    isIndexCorrect = false;
                }    
            }
            if(isIndexCorrect == false) {
                continue;
            }
            else {
                arraySingleNumber.add(arr[z]);
            }
        }

        for(int num: arraySingleNumber) {
            System.out.print(num + "\t");
        }

        System.out.println();
    }
}