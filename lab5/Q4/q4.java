public class q4 {
    public static void main(String[] args) {
        System.out.println(lengthOfString("Devesh"));
        String str = "Messi";

        System.out.println(str.substring(1));
    }

    public static int lengthOfString(String myString) {
        if(myString.length() == 0) {
            return 0;
        }
        else {
            return lengthOfString(myString.substring(1)) + 1;
        }
    }            


}