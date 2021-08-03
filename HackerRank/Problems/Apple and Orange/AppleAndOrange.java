/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apple.and.orange;
import java.util.Scanner;
/**
 *
 * @author PAZHOOR
 */
public class AppleAndOrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }
        String[] orangesItems = scanner.nextLine().split(" ");
        int[] oranges = new int[n];
        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }
        
        countApplesAndOranges(s, t, a, b, apples, oranges);

    }
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCounter = 0;
        int orangeCounter = 0;     
        for (int apple:apples) {
            if (apple + a >= s && apple + a <= t) {
                appleCounter += 1;
            }
        }
        for (int orange:oranges) {
            if (orange + b <= t && orange + b >=s) {
                orangeCounter += 1; 
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
    
}
