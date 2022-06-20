public class coinChange {
     public static void main(String[] args) {

          int amt = 11;
          int chn[] = new int[] {1, 3, 4, 7};
          
          // System.out.println("The minimum amount of coin needed for " + amt + " is " + dynamicMinNumCoins(amt, chn));

          int ans[] = minCoinsIteration(amt, chn);

          for(int i = 0; i < ans.length; i++) {
               System.out.print(ans[i] + " ");
          }

     }

     //greedy algorithm
     public static int minimumCoin(int amount, int changes[]) {
          
          int count = 0, remainingAmount = amount;

          for(int j = changes.length-1; j >= 0; j--) {
               while(remainingAmount >= changes[j]) {
                    remainingAmount = remainingAmount - changes[j];
                    count++;
               }
               if(remainingAmount == 0) {
                    break;
               }
          }
          return count;
     }

     public static int[] dynamicMinNumCoins(int amount,int[]denominations){
          
          int arrayOfMinimumCoins[] = new int[amount+1];
          arrayOfMinimumCoins[0] = 0;
          int smallest;
          
          for(int i = 1; i < arrayOfMinimumCoins.length; i++) { 
               smallest = Integer.MAX_VALUE;
               for(int j =0; j < denominations.length; j++) {
                    if(denominations[j] <= i) {
                         arrayOfMinimumCoins[i] = 1 + arrayOfMinimumCoins[i - denominations[j]];
                         if(arrayOfMinimumCoins[i] < smallest) smallest = arrayOfMinimumCoins[i];
                    }
               }
               arrayOfMinimumCoins[i] = smallest;
          }
          return arrayOfMinimumCoins;
     }

     public static int[] minCoinsIteration(int amount, int[] denominations) {
          int[] minCoins = new int[amount + 1];
          int min, tempMin;
          minCoins[0] = 0;
  
          for (int i = 1; i <= amount; i++) {
  
              min = (i / denominations[0]) + 1;
              // System.err.println(min);
              for (int j = 0; j < denominations.length; j++) {
                  if (i >= denominations[j]) {
                      tempMin = 1 + minCoins[i - denominations[j]];
                      // System.out.println(tempMin);
                      if (tempMin < min) {
                          min = tempMin;
                      }
                  } else {
                      break;
                  }
  
              }
  
              minCoins[i] = min;
          }
  
          return minCoins;
      }

}