public class similar {
     public static void main(String[] args) {

          String str = "abcdbefg";
          int index1 = 0, index2 = 0;
          boolean isThereDuplicates = false;

          for(int i = 0; i < str.length(); i++) {
               for(int j = (i+1); j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)) {
                         isThereDuplicates = true;
                         index1 = i;
                         index2 = j;
                    }
               }
          }

          if(isThereDuplicates == true) {
               System.out.println("There are duplicates at index " + index1 + " and index " + index2);
          }

     }
}