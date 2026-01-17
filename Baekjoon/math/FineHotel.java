package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-17 10min
// https://www.acmicpc.net/problem/12756
public class FineHotel {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aAttack = Integer.parseInt(st.nextToken());
        int aHealth = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int bAttack = Integer.parseInt(st.nextToken());
        int bHealth = Integer.parseInt(st.nextToken());

        while (aHealth > 0 && bHealth > 0) {
            aHealth -= bAttack;
            bHealth -= aAttack;
        }

        if (aHealth <= 0 && bHealth <= 0) {
            System.out.println("DRAW");
        } else if (aHealth <= 0) {
            System.out.println("PLAYER B");
        } else {
            System.out.println("PLAYER A");
        }
    }
}