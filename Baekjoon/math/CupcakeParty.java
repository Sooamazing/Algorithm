package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-28 5min
// https://www.acmicpc.net/problem/24568
public class CupcakeParty {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int multiple8 = Integer.parseInt(br.readLine());
        int multiple3 = Integer.parseInt(br.readLine());
        final int CLASS_PEOPLE = 28;

        System.out.println((multiple8 * 8 + multiple3 * 3) - CLASS_PEOPLE);
    }
}