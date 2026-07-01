package LeetCode.java;

// 26-07-01 25min
// https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array
public class ShortestDistancetoTargetStringinaCircularArray_2515 {

    public int closestTarget(String[] words, String target, int startIndex) {

        int min = words.length;
        boolean same = false;

        // right
        for (int i = 0; i < words.length; i++) {
            int index = (i + startIndex) % words.length;
            if (words[index].equals(target)) {
                same = true;
                min = i;
                break;
            }
        }

        // left
        for (int i = 0; i < words.length; i++) {
            int index =
                    ((startIndex - i) < 0) ? (words.length + (startIndex - i)) : (startIndex - i);
            if (words[index].equals(target)) {
                same = true;
                min = Math.min(i, min);
                break;
            }
        }

        return same ? min : -1;
    }
}