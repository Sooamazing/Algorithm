package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 25-12-29 15min
// https://www.acmicpc.net/problem/16466
// 참고: https://www.acmicpc.net/board/view/148977
public class Concert {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            pq.add(Integer.parseInt(st.nextToken()));
        }

        int currentSeat = 1;
        while (!pq.isEmpty()) {
            if (pq.peek() > currentSeat) {
                System.out.println(currentSeat);
                return;
            } else {
                currentSeat++;
                pq.poll();
            }
        }
        System.out.println(total + 1);
    }
}