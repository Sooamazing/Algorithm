package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-13 5min
// https://www.acmicpc.net/problem/5354
public class JBox {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            int size = Integer.parseInt(br.readLine());
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == (size - 1) || j == 0 || j == (size - 1)) {
                        sb.append("#");
                        continue;
                    }
                    sb.append("J");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
