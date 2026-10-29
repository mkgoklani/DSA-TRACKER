/*
 * Platform: TakeUForward
 * Problem: Pattern 19
 * URL: https://takeuforward.org/practice/dsa/pattern-19
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additional, My Space, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-29T07:33:55.583Z
 */

class Solution {
    public void pattern19(int n) {
        for(int i=0;i<n;i++){
            // stars
            for(int j=(n-i);j>0;j--){
                System.out.print("*");
            }
            // spaces
            for(int k=0;k<(2*i);k++){
                System.out.print(" ");
            }
            // stars
            for(int j=(n-i);j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int k=(2*(n-i));k>0;k--){
                System.out.print(" ");

            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
