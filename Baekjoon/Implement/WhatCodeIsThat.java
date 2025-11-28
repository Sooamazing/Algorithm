package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25/11/28 10min
// https://www.acmicpc.net/problem/31495
public class WhatCodeIsThat {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line.length() < 3) {
            System.out.println("CE");
            return;
        }

        // 정확한 문자열은 문자열의 시작과 끝이 큰따옴표로 이루어져 있으며 큰따옴표를 제외한 문자가 포함되어 있는 문자열을 뜻하는 말
        if (!line.startsWith("\"") || !line.endsWith("\"")) {
            System.out.println("CE");
            return;
        }

        String substring = line.substring(1, line.length() - 1);
        if (substring.isEmpty()) {
            System.out.println("CE");
            return;
        }

        System.out.println(substring);
    }
}