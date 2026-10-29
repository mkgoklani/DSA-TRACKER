/*
 * Platform: TakeUForward
 * Problem: Pattern 20
 * URL: https://takeuforward.org/practice/dsa/pattern-20
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additional, My Space, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 2.499 ms
 * Memory: N/A
 * Synced: 2026-10-29T09:48:30.716Z
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
