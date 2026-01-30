package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-30 10min
// https://www.acmicpc.net/problem/5612
public class EntranceAndExitOfTunnel {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        int currentCars = Integer.parseInt(br.readLine());
        int max = currentCars;
        for (int i = 0; i < time; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int entrance = Integer.parseInt(st.nextToken());
            int exit = Integer.parseInt(st.nextToken());
            currentCars += entrance - exit;
            if (currentCars < 0) {
                max = 0;
                break;
            }
            max = Math.max(max, currentCars);
        }

        System.out.println(max);
    }
}