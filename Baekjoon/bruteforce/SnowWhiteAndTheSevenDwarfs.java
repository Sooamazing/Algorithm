package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-05 10min
// https://www.acmicpc.net/problem/3040
public class SnowWhiteAndTheSevenDwarfs {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] dwarfs = new int[9];
        int rest = 0;
        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            rest += dwarfs[i];
        }
        rest -= 100;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (dwarfs[i] + dwarfs[j] == rest) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            sb.append(dwarfs[k]).append("\n");
                        }
                    }
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}