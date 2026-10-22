/*
 * Platform: TakeUForward
 * Problem: Pattern 8
 * URL: https://takeuforward.org/practice/dsa/pattern-8
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: 0.817 ms
 * Memory: N/A
 * Synced: 2026-10-21T11:49:19.204Z
 */

class Solution {
    public void pattern8(int n) {

for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.print(" ");
    }
    for(int k=0;k<(2*n)-1-2*i;k++){
        System.out.print("*");
    }
    System.out.println();
}
    }
