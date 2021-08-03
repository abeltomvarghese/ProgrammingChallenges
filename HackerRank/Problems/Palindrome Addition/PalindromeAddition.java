/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeaddition;
import java.util.*;
/**
 *
 * @author PAZHOOR
 */
public class PalindromeAddition {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(int number) {
        StringBuilder wholeString = new StringBuilder();
        String thisString = Integer.toString(number);
        //thisString = 
        for (int index = thisString.length() -1;index >= 0;index--) {
            wholeString.append(thisString.charAt(index));    
        }
        thisString = wholeString.toString();
        Integer checkIfPal = Integer.valueOf(thisString);
        if (number == checkIfPal) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int input;
        System.out.print("Please enter your number: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        while (isPalindrome(input)) {
            input = input * 2;
            System.out.println(input);
        }
        
    }
    
}
