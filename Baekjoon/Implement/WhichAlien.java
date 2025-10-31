package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-31 10min
// https://www.acmicpc.net/problem/6778
public class WhichAlien {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        TroyMartian, who has at least 3 antenna and at most 4 eyes;
//        VladSaturnian, who has at most 6 antenna and at least 2 eyes;
//        GraemeMercurian, who has at most 2 antenna and at most 3 eyes.

        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        if (antenna >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (antenna <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (antenna <= 2 && eyes <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}