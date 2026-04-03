package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;


// 26-04-03 3min
// https://www.acmicpc.net/problem/8545
// https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-8545-Zadanie-pr%C3%B3bne-java
public class ZadaniePróbne {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new StringBuilder(br.readLine()).reverse());
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
