package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 26-01-07 25min
// https://www.acmicpc.net/problem/24039
public class WhatsSpecialAbout2021 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 2; i <= number + 2; i++) {
            if (isPrime(i)) {
                pq.add(i);
            }
        }

        int prev = pq.poll();
        while (!pq.isEmpty()) {
            int current = pq.poll();

            int sum = prev * current;
            if (sum > number) {
                System.out.println(sum);
                return;
            }

            prev = current;
        }

    }

    private static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}