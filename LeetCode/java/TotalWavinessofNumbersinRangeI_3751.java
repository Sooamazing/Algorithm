package LeetCode.java;

// 26-06-04 10min
// https://leetcode.com/problems/total-waviness-of-numbers-in-range-i
class TotalWavinessofNumbersinRangeI_3751 {

    public int totalWaviness(int num1, int num2) {

        int totalWaviness = 0;
        for (int i = num1; i <= num2; i++) {
            String num = String.valueOf(i);
            int prev = num.charAt(0) - '0';
            int current = 0;
            if (i > 10) {
                current = num.charAt(1) - '0';
            }
            for (int j = 1; j < num.length() - 1; j++) {
                int last = num.charAt(j + 1) - '0';
                if (prev < current && current > last) {
                    totalWaviness++;
                } else if (prev > current && current < last) {
                    totalWaviness++;
                }
                prev = current;
                current = last;
            }
        }

        return totalWaviness;
    }
}