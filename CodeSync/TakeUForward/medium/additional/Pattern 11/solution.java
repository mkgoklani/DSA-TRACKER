/*
 * Platform: TakeUForward
 * Problem: Pattern 11
 * URL: https://takeuforward.org/practice/dsa/pattern-11
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-22T18:40:52.730Z
 */

class Solution {
    public void pattern5(int n) {
for(int i=n-1;i>=0;i--){
    for(int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
