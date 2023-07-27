import java.util.*;
public class Main {
    public int[] removePrice(int[] prices, int toRemove) {
        int[] newPrices = new int[prices.length-1];

        for(int i=0, k=0;i<prices.length;i++){
            if(prices[i]!=toRemove){
                newPrices[k]=prices[i];
                k++;
            }
        }
        return newPrices;
    }

    //Test output
    public static void main(String[] args) {
        Main shop = new Main();

        //Should be [150, 200]
        int[] prices = new int[]{150, 100, 200};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
    }
}