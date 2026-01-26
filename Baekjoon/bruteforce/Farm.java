package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-26 22 10min
// https://www.acmicpc.net/problem/16283
public class Farm {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sheepWeed = Integer.parseInt(st.nextToken());
        int goatWeed = Integer.parseInt(st.nextToken());
        int totalAnimal = Integer.parseInt(st.nextToken());
        int totalWeed = Integer.parseInt(st.nextToken());

        int sheep = 0;
        int goat = 0;
        for (int i = 1; i < totalAnimal; i++) {
            int tempSheep = i;
            int tempGoat = totalAnimal - i;

            int tempTotalWeed = tempSheep * sheepWeed + tempGoat * goatWeed;
            if (tempTotalWeed == totalWeed) {
                if (sheep != 0) {
                    System.out.println(-1);
                    return;
                }
                sheep = tempSheep;
                goat = tempGoat;
            }
        }

        if (sheep == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sheep + " " + goat);
    }
}