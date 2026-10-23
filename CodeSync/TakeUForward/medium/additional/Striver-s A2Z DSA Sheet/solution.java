/*
 * Platform: TakeUForward
 * Problem: Striver’s A2Z DSA Sheet
 * URL: https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet
 * Language: Java
 * Difficulty: Medium
 * Topics: Prep, Additionals, My Spaces, Dashboard, Prep Hub, DSA, SQL, Quantitative
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-10-23T17:36:56.088Z
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
