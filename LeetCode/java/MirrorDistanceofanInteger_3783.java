package LeetCode.java;

// 26-06-21 3min
// https://leetcode.com/problems/mirror-distance-of-an-integer
public class MirrorDistanceofanInteger_3783 {

    public int mirrorDistance(int n) {

        StringBuilder sb = new StringBuilder();
        sb.append(n);
        StringBuilder reverseSb = sb.reverse();
        int reverse = Integer.parseInt(reverseSb.toString());

        return Math.abs(n - reverse);
    }
}