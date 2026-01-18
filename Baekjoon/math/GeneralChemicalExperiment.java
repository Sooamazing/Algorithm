package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-18 10min
// https://www.acmicpc.net/problem/4766
public class GeneralChemicalExperiment {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double prev = Double.parseDouble(br.readLine());
        while (true) {
            double current = Double.parseDouble(br.readLine());
            if (current == 999) {
                break;
            }
            sb.append(String.format("%.2f", current - prev)).append('\n');
            prev = current;
        }

        System.out.println(sb);
    }
}