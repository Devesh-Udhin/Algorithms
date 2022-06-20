public class DynamicChange {
        public static void main(String[] args) {
                int[] change = new int[] {10, 5, 1};

                int x = dynamicMinNumCoins(8, change);

                System.out.println(x);
        }

        public static int dynamicMinNumCoins(int num, int[] denominations){

                int[] minCoin = new int[num + 1];
                int tempMin;

                for(int j = 1; j <= num; j++){
                        System.out.println(denominations[denominations.length - 1]);
                        minCoin[j] = (j/denominations[denominations.length - 1]) + 1;
                
                        for(int i = 0; i < denominations.length; i ++){
                                // System.out.println(denominations[i]);
                                if(j >= denominations[i]){
                                        
                                        tempMin = minCoin[j - denominations[i]] + 1;
                                        
                                        if(tempMin < minCoin[j]){
                                                minCoin[j] = tempMin;
                                        }
                                }
                        }

                }

                return minCoin[num];
                
        }

}
