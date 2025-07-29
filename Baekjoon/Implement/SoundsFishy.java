package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-29 27
// https://www.acmicpc.net/problem/6764
public class SoundsFishy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int prev = Integer.parseInt(br.readLine());
        boolean isUp = false;
        boolean isDown = false;
        boolean isConstant = false;
        for (int i = 1; i < 4; i++) {
            int current = Integer.parseInt(br.readLine());
            if (i < 2) {
                isUp = prev < current;
                isDown = prev > current;
                isConstant = prev == current;
                continue;
            }
            if (isUp) {
                if ((prev >= current)) {
                    System.out.println("No Fish.");
                }
            } else if (isDown) {
                if ((prev <= current)) {
                    System.out.println("No Fish.");
                }
            } else if (isConstant) {
                if (prev != current) {
                    System.out.println("No Fish");
                }
            }
        }

        if (isUp) {
            System.out.println("Fish Rising");
        } else if (isDown) {
            System.out.println("Fish Diving");
        } else if (isConstant) {
            System.out.println("Fish At Constant Depth");
        }
    }
}