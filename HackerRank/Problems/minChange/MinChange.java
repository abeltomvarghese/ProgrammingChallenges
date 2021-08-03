/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minchange;

/**
 *
 * @author PAZHOOR
 */
public class MinChange {

    /**
     * @param coins
     * @param args the command line arguments
     */
    public static int getBiggestElement(int[] coins) {
        int biggestIndex = 0;
        for (int x = 0; x<coins.length;x++) {
            if (biggestIndex < coins[x]) {
                biggestIndex = x;
            }
        }
        return biggestIndex;
    }
    public static int minChange(int coins[], int goal, int leng) {
        
        if (goal == 0) {
            return 0;
        }
        int coinsNeeded = 0;
        int index = getBiggestElement(coins);
        for (int x = 0; x<leng; x++) {
            if (coins[x] <= goal && coins[x] != 0) {
                int count = coins[x];
                coins[x] = 0;
                coinsNeeded += 1 + minChange(coins,goal - count,coins.length);
                //return 1 + minChange(coins,goal - count,coins.length);
                return coinsNeeded;
               
            }
        } /*
        if (coins[index] <= goal) {
            int count = coins[index];
            coins[index] = 0;
            coinsNeeded += 1 + minChange(coins,goal-count,coins.length);
            return coinsNeeded; 
        } */
        return coinsNeeded;
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int coins[] = {5,4,3,2,1};
        int goal = 11;
        int length = coins.length;
        System.out.println("minimum coins required is " + minChange(coins,goal,length));
    }
    
}
