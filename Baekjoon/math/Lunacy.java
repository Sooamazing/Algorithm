package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-21 3min
// https://www.acmicpc.net/problem/4714
public class Lunacy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            double weight = Double.parseDouble(br.readLine());
            if (weight < 0) {
                break;
            }

            double lunarWeight = weight * 0.167;
            sb.append(String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.",
                    weight, lunarWeight)).append("\n");
        }

        System.out.println(sb);
    }
}