/*
 * Platform: TakeUForward
 * Problem: Pattern 2
 * URL: https://takeuforward.org/practice/dsa/pattern-2
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.580 ms
 * Memory: N/A
 * Synced: 2026-10-20T18:07:29.952Z
 */

class Solution {
    public void pattern2(int n) {
for(int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
