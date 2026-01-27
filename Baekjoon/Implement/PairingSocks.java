package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 26-01-27 5min
// https://www.acmicpc.net/problem/28431
public class PairingSocks {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> socksSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            int socks = Integer.parseInt(br.readLine());
            if (socksSet.contains(socks)) {
                socksSet.remove(socks);
            } else {
                socksSet.add(socks);
            }
        }

        int answer = 0;
        for (int socks : socksSet) {
            answer = socks;
        }

        System.out.println(answer);
    }
}