package LeetCode.java;

import java.util.Set;

// 26-06-10 15min
// https://leetcode.com/problems/reverse-vowels-of-a-string/
public class ReverseVowelsofaString_345 {

    public String reverseVowels(String s) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u'
                , 'A', 'E', 'I', 'O', 'U');
        char[] sArr = s.toCharArray();

        int leftPtr = 0;
        int rightPtr = sArr.length - 1;
        boolean isLeftVowel = false;
        boolean isRightVowel = false;

        while (leftPtr < rightPtr) {
            char left = sArr[leftPtr];
            char right = sArr[rightPtr];
            if (!isLeftVowel && vowels.contains(left)) {
                isLeftVowel = true;
            }
            if (!isRightVowel && vowels.contains(right)) {
                isRightVowel = true;
            }

            if (!isLeftVowel) {
                leftPtr++;
            }
            if (!isRightVowel) {
                rightPtr--;
            }

            if (isLeftVowel && isRightVowel) {
                System.out.println(
                        "leftPtr: " + leftPtr + ", left: " + left + ", rightPtr: " + rightPtr
                                + ", right: " + right);
                sArr[leftPtr++] = right;
                sArr[rightPtr--] = left;
                isLeftVowel = false;
                isRightVowel = false;
            }
        }

        return String.valueOf(sArr);
    }
}