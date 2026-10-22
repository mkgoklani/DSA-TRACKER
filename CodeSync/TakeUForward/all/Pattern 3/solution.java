/*
 * Platform: TakeUForward
 * Problem: Pattern 3
 * URL: https://takeuforward.org/practice/dsa/pattern-3
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.559 ms
 * Memory: N/A
 * Synced: 2026-10-20T18:07:37.953Z
 */

class Solution {
    public void pattern3(int n) {
for(int i=0;i<n;i++){
    for(int j=1;j<=i+1;j++){
        System.out.print(j);
    }
    System.out.println();
}
    }
}
