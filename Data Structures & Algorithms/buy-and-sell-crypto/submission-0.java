class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<prices.length-1; i++){
            for (int j=i+1; j<prices.length; j++){
                int price = prices[j] - prices[i];
                max = Math.max(price,max);
            }
        }
        return max < 0 ? 0 : max;
    }
}
