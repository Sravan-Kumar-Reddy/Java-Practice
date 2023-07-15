package Java.Practice.Code;


/*
Input: Numbers announced so far, a valid ticket and claim for a specific game
Output: Accepted/Rejected
Games
Each round has multiple games. Each game has a winning pattern.
● Top line: The ticket with all the numbers of the top row crossed fastest
● Middle line: The ticket with all the numbers of the middle row crossed fastest
● Bottom line: The ticket with the numbers of the bottom row crossed fastest
● Full house: The ticket with all the 15 numbers crossed first
● Early five: The fastest ticket to have 5 numbers crossed
Rules
1. System only has to return whether a claim is accepted or rejected
2. A player's claim to victory is only valid if it is made immediately following the
announcement of the number that completes their winning sequence
*/
/*
Examples
Example 1: Top row win
Input
Ticket Numbers announced Claim being made
4,16,_,_,48,_,63,76,_
7,_,23,38,_,52,_,_,80
9,_,25,_,_,56,64,_,83


90, 4, 46, 63, 89, 16, 76, 48 <-> Top Row
Output Accepted
Explanation Winning pattern: 4, 63, 16, 48, 76

Example 2: Top row win denied due to late claim
Input
Ticket Numbers announced Claim being made
4,16,_,_,48,_,63,76,_
7,_,23,38,_,52,_,_,80
9,_,25,_,_,56,64,_,83
90, 4, 46, 63, 89, 16, 76, 48, 12 Top Row
Output Rejected
Explanation The last announced number 12 does not complete the top
row
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tambola {
    public String validateClaim(int[][] input, int[] numbersAnnounced, String claimMade) {
        List<Integer> topRow = new ArrayList<Integer>();
        List<Integer> midRow = new ArrayList<Integer>();
        List<Integer> bottomRow = new ArrayList<Integer>();
        for(int i=0;i<input[0].length;i++){
            if(input[0][i]!=0){
                topRow.add(input[0][i]);
            }
        }
        for(int i=0;i<input[1].length;i++){
            if(input[1][i]!=0){
                midRow.add(input[1][i]);
            }
        }
        for(int i=0;i<input[2].length;i++){
            if(input[2][i]!=0){
                bottomRow.add(input[2][i]);
            }
        }

        int topCount = 0;
        int midCount = 0;
        int bottomCount = 0;
        for (int i = 0; i < numbersAnnounced.length; i++) {
            if(claimMade.equals("Top Row")){
                if (topRow.contains(numbersAnnounced[i])) {
                    topCount++;
                    if (topCount >= 5) {
                        if(topRow.contains(numbersAnnounced[numbersAnnounced.length-1])){//Checking for late Claim
                            return "Accepted";
                        }
                    }
                }
            }else if(claimMade.equals("Mid Row")){
                if (midRow.contains(numbersAnnounced[i])) {
                    midCount++;
                    if (midCount >= 5) {
                        if(midRow.contains(numbersAnnounced[numbersAnnounced.length-1])){//Checking for late Claim
                            return "Accepted";
                        }
                    }
                }
            }else if(claimMade.equals("Bottom Row")){
                if (bottomRow.contains(numbersAnnounced[i])) {//Checking for late Claim
                    bottomCount++;
                    if (bottomCount >= 5&&numbersAnnounced[numbersAnnounced.length-1]==bottomRow.get(bottomRow.size()-1)) {
                        if(bottomRow.contains(numbersAnnounced[numbersAnnounced.length-1])){
                            return "Accepted";
                        }
                    }
                }
            }
        }

        return "Rejected";
    }

    public static void main(String[] args) {
        Tambola tambola = new Tambola();
        System.out.print(tambola.validateClaim(
                new int[][]{{4,16,0,0,48,0,63,76,0},{7,0,23,38,0,52,0,0,80},{9,0,25,0,0,56,64,0,83}},
                new int[]{90, 4, 46, 63, 89, 16, 76, 48, 12},
                "Top Row"
                ));
        System.out.println();
        System.out.println(tambola.validateClaim(
                new int[][]{{4,16,0,0,48,0,63,76,0},{7,0,23,38,0,52,0,0,80},{9,0,25,0,0,56,64,0,83}},
                new int[]{90, 4, 46, 63, 89, 16, 76, 48},
                "Top Row"
                ));
    }
}
