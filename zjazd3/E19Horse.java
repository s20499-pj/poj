/**
 *Summary: https://www.codingame.com/ide/puzzle/horse-racing-duals
 *Author: Tomasz Baj s20499-pj
 */

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int diff = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) { 
            arr[i] = in.nextInt();   
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < N-1; i++) {
            if (arr[i+1] - arr[i] < diff) {
                diff = arr[i+1] - arr[i];
            }         
        }
        System.out.println(diff);
    }
}
