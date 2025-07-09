package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-09 5min
// https://www.acmicpc.net/problem/3059
public class SumOfCharactersThatDoNotAppear {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            String word = br.readLine();
            int sum = 2015;
//            for (char i = 'A'; i <= 'Z'; i++) {
//                sum += i;
//            }
            boolean[] isExist = new boolean[26];
            for (char c : word.toCharArray()) {
                int index = c - 'A';
                if (!isExist[index]) {
                    sum -= (index + 65);
                    isExist[index] = true;
                }
            }
//            for (int i = 0; i < 26; i++) {
//                if (isExist[i]) {
//                    sum -= (i + 65);
//                    isExist[i] = true;
//                }
//            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }

}
