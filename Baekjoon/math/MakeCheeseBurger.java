package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-24 10min
// https://www.acmicpc.net/problem/30017
public class MakeCheeseBurger {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int patty = Integer.parseInt(st.nextToken());
        int cheese = Integer.parseInt(st.nextToken());

        int height = Math.min(patty, cheese) * 2;
        if (patty > cheese) {
            height++;
        } else {
            height--;
        }
        System.out.println(height);
    }
}