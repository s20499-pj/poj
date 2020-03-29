/**
 *Summary: https://www.codingame.com/training/easy/power-of-thor-episode-1
 *Author: Tomasz Baj s20499
 */

package zjazd3;

import java.util.*;
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

 

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

 

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

 

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

 

            if ((lightY - initialTy) == 0){
                System.out.print("");
            } else if (lightY < initialTy){
                System.out.print("N");
                initialTy--;
            } else {
                System.out.print("S");
                initialTy++;
            }

 

            if ((lightX - initialTx) == 0){
                System.out.print("");
            } else if (lightX < initialTx){
                System.out.print("W");
                initialTx--;
            } else {
                System.out.print("E");
                initialTx++;
            }
	    

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println();
        }
    }
}
