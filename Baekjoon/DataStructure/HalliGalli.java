package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 26-02-28 3min
// https://www.acmicpc.net/problem/27160
public class HalliGalli {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int count = Integer.parseInt(st.nextToken());
            map.put(name, map.getOrDefault(name, 0) + count);
        }

        for (int count : map.values()) {
            if (count == 5) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");

    }
}