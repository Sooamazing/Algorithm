package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-05 3min
// https://www.acmicpc.net/problem/27389
public class Metronome {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ticks = Integer.parseInt(br.readLine());
        System.out.println(String.format("%.2f", ticks / 4.0));
    }
}