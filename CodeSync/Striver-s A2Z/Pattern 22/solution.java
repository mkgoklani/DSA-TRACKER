/*
 * Platform: TakeUForward
 * Problem: Pattern 22
 * URL: https://takeuforward.org/practice/dsa/pattern-22
 * Language: Java
 * Difficulty: Medium
 * Topics: Uncategorized
 * Runtime: 0.895 ms
 * Memory: N/A
 * Synced: 2026-10-29T14:16:10.406Z
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
