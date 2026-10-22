/*
 * Platform: TakeUForward
 * Problem: Pattern 6
 * URL: https://takeuforward.org/practice/dsa/pattern-6
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.489 ms
 * Memory: N/A
 * Synced: 2026-10-20T18:07:15.546Z
 */

class Solution {
    public void pattern6(int n) {
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }System.out.println();
}
    }
}
