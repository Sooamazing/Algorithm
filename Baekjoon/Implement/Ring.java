package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-15 5min
// https://www.acmicpc.net/problem/5555
public class Ring {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String find = br.readLine();
        int total = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < total; i++) {
            String line = br.readLine().repeat(2);
            boolean contains = line.contains(find);
            if (contains) {
                count++;
            }
        }

        System.out.println(count);
    }
}