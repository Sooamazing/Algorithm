package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-19 2min
// https://www.acmicpc.net/problem/25640
public class MBTI {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jinho = br.readLine();

        int total = Integer.parseInt(br.readLine());
        int same = 0;
        while (total-- > 0) {
            String friend = br.readLine();
            if (jinho.equals(friend)) {
                same++;
            }
        }

        System.out.println(same);
    }
}