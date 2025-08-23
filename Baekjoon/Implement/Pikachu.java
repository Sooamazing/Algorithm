package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-23 3min
// https://www.acmicpc.net/problem/14405
public class Pikachu {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        boolean matches = word.matches("^(pi|ka|chu)+$");

        if (matches) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

//        String replaced = word.replaceAll("pi", " ").replaceAll("ka", " ").replaceAll("chu", " ");
//
//        if (replaced.isBlank()) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }
}