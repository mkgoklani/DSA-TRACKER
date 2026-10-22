/*
 * Platform: TakeUForward
 * Problem: Pattern 5
 * URL: https://takeuforward.org/practice/dsa/pattern-5
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.569 ms
 * Memory: N/A
 * Synced: 2026-10-20T18:07:07.109Z
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
