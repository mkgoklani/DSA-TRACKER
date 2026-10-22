/*
 * Platform: TakeUForward
 * Problem: Pattern 10
 * URL: https://takeuforward.org/practice/dsa/pattern-10
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: Runtime : 0.578 ms
 * Memory: N/A
 * Synced: 2026-10-21T19:17:40.732Z
 */

class Solution {
    public void pattern10(int n) {
        for(int i=1;i<(2*n);i++){
            for(int j=1;j<=i && i<n;j++){
                System.out.print("*");
            }
            for(int k=(2*n)-i;k>0 && i>=n;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
