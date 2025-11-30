package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

// 25-11-30 50min
// https://www.acmicpc.net/problem/20551
public class SuccessionOfSortMasterBaeJihoon {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int query = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < total; i++) {
            int currentNum = Integer.parseInt(br.readLine());
            map.put(currentNum, map.getOrDefault(currentNum, 0) + 1);
        }
        int sum = 0;
        for (int v : map.keySet()) {
            int current = map.get(v);
            map.put(v, sum);
            sum += current;
        }

        for (int i = 0; i < query; i++) {
            int find = Integer.parseInt(br.readLine());
            sb.append(map.getOrDefault(find, -1)).append("\n");
        }

        System.out.println(sb);
    }
}