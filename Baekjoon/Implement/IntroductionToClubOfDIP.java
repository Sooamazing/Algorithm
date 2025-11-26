package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

// 25-11-26 2min
// https://www.acmicpc.net/problem/28691
public class IntroductionToClubOfDIP {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // M, W, C, A, $
        Map<String, String> map = Map.of(
                "M", "MatKor",
                "W", "WiCys", "C", "CyKor", "A", "AlKor", "$", "$clear"
        );

        System.out.println(map.get(br.readLine()));
    }
}