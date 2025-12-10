package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-10 3min
// https://www.acmicpc.net/problem/21964
public class SunlinInternetHighSchoolSong {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        String sentence = br.readLine();

        System.out.println(sentence.substring(total - 5, total));
    }
}