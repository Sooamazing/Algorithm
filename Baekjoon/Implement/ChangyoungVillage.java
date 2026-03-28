package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-28 5min
// https://www.acmicpc.net/problem/3028
public class ChangyoungVillage {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = br.readLine();

        int position = 1;
        for (char c : command.toCharArray()) {
            if (c == 'A') {
                if (position == 1) {
                    position = 2;
                } else if (position == 2) {
                    position = 1;
                }
            } else if (c == 'B') {
                if (position == 2) {
                    position = 3;
                } else if (position == 3) {
                    position = 2;
                }
            } else if (c == 'C') {
                if (position == 1) {
                    position = 3;
                } else if (position == 3) {
                    position = 1;
                }
            }
        }

        System.out.println(position);
    }
}