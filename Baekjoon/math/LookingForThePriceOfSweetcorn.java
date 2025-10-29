package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-29 4min
// https://www.acmicpc.net/problem/30030
public class LookingForThePriceOfSweetcorn {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = Integer.parseInt(br.readLine());

        System.out.println((price / 11 * 10));
    }
}