package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 25-05-17 20min, 25-10-13 10min
// https://www.acmicpc.net/problem/2605
// https://www.acmicpc.net/board/view/110027
public class LineUp {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());

        List<Integer> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            int numberIndex = Integer.parseInt(st.nextToken());
            if (i == 0) {
                list.add(1);
                continue;
            }
            int index = list.size() - numberIndex;
            list.add(index, i + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + " ");
        }

        System.out.println(sb);
    }
}