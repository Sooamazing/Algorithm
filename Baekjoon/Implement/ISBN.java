package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-30 30min
// https://www.acmicpc.net/problem/14626
// 참고: https://www.acmicpc.net/board/view/161814
public class ISBN {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();
        int divide = 0;
        int sum = 0;
        for (int i = 0; i < isbn.length() - 1; i++) {
            if (i % 2 == 0) {
                if (isbn.charAt(i) == '*') {
                    divide = 1;
                    continue;
                }
                sum += (isbn.charAt(i) - '0');
                continue;
            }
            if (isbn.charAt(i) == '*') {
                divide = 3;
                continue;
            }
            sum += (isbn.charAt(i) - '0') * 3;
        }
        int check = isbn.charAt(isbn.length() - 1) - '0';

        for (int i = 0; i < 10; i++) {
            int mod = (sum + divide * i) % 10;
            int diffCheck = mod == 0 ? 0 : 10 - mod;
            if (check == diffCheck) {
                System.out.println(i);
                return;
            }
        }
    }
}