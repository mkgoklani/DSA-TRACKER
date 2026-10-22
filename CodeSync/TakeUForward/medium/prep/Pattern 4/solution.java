/*
 * Platform: TakeUForward
 * Problem: Pattern 4
 * URL: https://takeuforward.org/practice/dsa/pattern-4
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.611 ms
 * Memory: N/A
 * Synced: 2026-10-20T18:06:59.312Z
 */

class Solution {
    public void pattern4(int n) {
for(int i=1;i<n+1;i++){
    for(int j=0;j<i;j++){
        System.out.print(i);
    }
    System.out.println();
}
    }
}
