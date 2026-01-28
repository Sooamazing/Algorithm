package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-28 5min
// https://www.acmicpc.net/problem/1731
public class Inference {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int prev = Integer.parseInt(br.readLine());
        int curr = Integer.parseInt(br.readLine());

        int diffPlus = curr - prev;
        int diffDiv = curr / prev;
        boolean isPlus = true;
        prev = curr;
        for (int i = 2; i < total; i++) {
            curr = Integer.parseInt(br.readLine());
            if (curr - prev != diffPlus) {
                isPlus = false;
            }
            prev = curr;
        }

        if (isPlus) {
            System.out.println(curr + diffPlus);
        } else {
            System.out.println(curr * diffDiv);
        }

    }
}