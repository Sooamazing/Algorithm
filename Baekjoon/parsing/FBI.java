package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-09-12 5min
// https://www.acmicpc.net/problem/2857
public class FBI {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int result = 0;
        for (int i = 1; i <= 5; i++) {
            boolean contains = br.readLine().contains("FBI");
            if (contains) {
                result = i;
                sb.append(i).append(" ");
            }
        }

        System.out.println(result == 0 ? "HE GOT AWAY!" : sb);
    }
}