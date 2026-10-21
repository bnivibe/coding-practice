class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            int val = prices[i];
            if(val < minVal){
                minVal = val;
            }else{
                max = Math.max((val - minVal), max);
            }

        }
        return max;
    }
}