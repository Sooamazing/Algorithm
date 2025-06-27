package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-27 5min
// https://www.acmicpc.net/problem/10409
public class Server {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int maxTime = Integer.parseInt(st.nextToken());

        int currentTime = 0;
        int task = 0;
        st = new StringTokenizer(br.readLine());
        for (; task < total; task++) {
            int time = Integer.parseInt(st.nextToken());
            // 초과하지 않아야 함.
            currentTime += time;
            if (currentTime > maxTime) {
                break;
            }
        }

        System.out.println(task);
    }

}
