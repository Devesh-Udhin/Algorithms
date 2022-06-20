import java.util.ArrayList;

public class q1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            arr.add(new Integer(i+1));
        }

        arr.remove(71);

        for(int num: arr) {
            System.out.println(num);
        }

        for(int j = 0; j < arr.size(); j++) {
            if((arr.get(j)) != (j+1)) {
                System.out.println("Missing number is " + (j+1));
                break;
            }
        }
    }
}