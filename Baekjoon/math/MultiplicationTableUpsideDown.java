package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 25-09-11 5min
// https://www.acmicpc.net/problem/13410
public class MultiplicationTableUpsideDown {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int tier = Integer.parseInt(st.nextToken());
        int rows = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= rows; i++) {
            String number = String.valueOf(tier * i);
            String reversedNumber = new StringBuilder(number).reverse().toString();
            list.add(Integer.parseInt(reversedNumber));
        }

        Collections.sort(list);

        System.out.println(list.get(list.size() - 1));
    }
}