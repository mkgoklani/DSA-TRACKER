/*
 * Platform: TakeUForward
 * Problem: Pattern 7
 * URL: https://takeuforward.org/practice/dsa/pattern-7
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.572 ms
 * Memory: N/A
 * Synced: 2026-10-20T18:08:01.775Z
 */

class Solution {
    public void pattern7(int n) {
for (int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");

    }
    for(int k=0;k<(2*i)-1;k++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
