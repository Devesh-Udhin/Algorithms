public class q3 {
    public static void main(String[] args) {
        System.out.println(triangular(4));
    }

//     public static int triangular(int nthTerm) {
//         if (nthTerm == 1) {
//             return 1;
//         }
//         else {
//             return triangular(nthTerm-1) + nthTerm;
//         }
//     }

public static int triangular(int term) {
     if(term == 1) {
          return 1;
     }
     else {
          return triangular(term-1) + term;
     }
}

}