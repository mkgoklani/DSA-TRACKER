/*
 * Platform: TakeUForward
 * Problem: Pattern 15
 * URL: https://takeuforward.org/practice/dsa/pattern-15
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-22T19:04:02.019Z
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
