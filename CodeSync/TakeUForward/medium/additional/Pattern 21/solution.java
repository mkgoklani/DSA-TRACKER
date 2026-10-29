/*
 * Platform: TakeUForward
 * Problem: Pattern 21
 * URL: https://takeuforward.org/practice/dsa/pattern-21
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additional, My Space, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.545 ms
 * Memory: N/A
 * Synced: 2026-10-29T10:17:56.157Z
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
