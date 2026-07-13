package LeetCode.java;

import java.util.LinkedList;
import java.util.List;

// 26-07-13 30min
// https://leetcode.com/problems/sequential-digits
public class SequentialDigits_1291 {

    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> answers = new LinkedList<>();

        int minLength = 0;
        int temp = low;
        while (temp != 0) {
            minLength++;
            temp /= 10;
        }
        int maxLength = 0;
        temp = high;
        while (temp != 0) {
            maxLength++;
            temp /= 10;
        }

        int current = low;
        int currentLength = minLength;
        // System.out.println("current: " + current + ", currentLength: " + currentLength);
        while ((current <= high) && (currentLength <= maxLength)) {
            // 최소 길이 ~ 최대 길이
            // 1~(9-길이+1)
            for (int number = 1; number <= 9; number++) {
                current = number;
                boolean skip = false;
                // System.out.println("current: " + current + ", currentLength: " + currentLength);
                int tempNumber = current;
                tempNumber++;
                for (int length = 1; length < currentLength; length++) {
                    if (tempNumber > 9) {
                        skip = true;
                        break;
                    }
                    current *= 10;
                    current += tempNumber++;
                    // System.out.println("in --- current: " + current + ", currentLength: " + currentLength);
                }
                if (current < low) {
                    continue;
                }
                if (current > high) {
                    break;
                }
                if (skip) {
                    continue;
                }
                // System.out.println("live: " + current);
                answers.add(current);
            }
            currentLength++;
        }

        return answers;
    }
}