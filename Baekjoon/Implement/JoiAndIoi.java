package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-03 20min
// https://www.acmicpc.net/problem/5586
public class JoiAndIoi {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();

        // regex로 joi를 group으로 감지하기
        // JOIJOI는 2번
        int joiCount = 0;
        int ioiCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'j' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'i') {
                i += 1;
                joiCount++;
            } else if (str.charAt(i) == 'i' && str.charAt(i + 1) == 'o'
                    && str.charAt(i + 2) == 'i') {
                i += 1;
                ioiCount++;
            }
        }

        System.out.println(joiCount);
        System.out.println(ioiCount);

    }
}