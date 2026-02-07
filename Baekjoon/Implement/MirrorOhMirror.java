package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-02-07 2min
// https://www.acmicpc.net/problem/4740
public class MirrorOhMirror {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String sentence = br.readLine();
            if (sentence.equals("***")) {
                break;
            }
            StringBuilder reversed = new StringBuilder(sentence).reverse();
            sb.append(reversed).append('\n');
        }

        System.out.println(sb);
    }
}