package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-09-27 3min
// https://www.acmicpc.net/problem/29699
public class WelcomeToSMUPC {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());
        String sentence = "WelcomeToSMUPC";

        System.out.println(sentence.charAt((index - 1) % sentence.length()));
    }
}