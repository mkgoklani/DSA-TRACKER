/*
 * Platform: TakeUForward
 * Problem: Pattern 1
 * URL: https://takeuforward.org/practice/dsa/pattern-1
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.811 ms
 * Memory: N/A
 * Synced: 2026-10-20T18:06:29.955Z
 */

class Solution {
    public void pattern1(int n) {
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
