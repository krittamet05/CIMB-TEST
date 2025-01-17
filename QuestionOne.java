

public class QuestionOne {
    public static void main(String[] args) {
        System.out.println("max-profit: " + maxProfit2(new int[]{7,1,5,3,6,4}));
        System.out.println("max-profit: " + maxProfit2(new int[]{7,6,4,3,1}));
        
    }

    public static int maxProfit(int[] prices){
        int profit = 0;
        if(prices == null || prices.length < 2){
            return profit;
        }
        
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] > prices[i] && prices[j] - prices[i] > profit){
                    System.out.println("buy:" + prices[i] + ", sell: " + prices[j] );
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }

    public static int maxProfit2(int[] prices){
        if(prices == null || prices.length < 2){
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int price:prices){
            if(minPrice > price){
                minPrice = price;
            }

            int profit = price - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}