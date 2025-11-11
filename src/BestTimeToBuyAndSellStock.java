
public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
        	for (int j = i + 1; j < prices.length; j++) {
        		if (prices[j] - prices[i] > maxProfit) maxProfit = prices[j] - prices[i];
        	}
        }
        
        return maxProfit;
    }
	
	public static void main(String[] args) {
		var btbss = new BestTimeToBuyAndSellStock();
		System.out.println(btbss.maxProfit(new int[] {7,1,5,3,6,4}));
	}

}
