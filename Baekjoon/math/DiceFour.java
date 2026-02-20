package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-20 15min
// https://www.acmicpc.net/problem/2484
public class DiceFour {

    public static void main(String[] args) throws IOException {
// 같은 눈이 4개가 나오면 50,000원+(같은 눈)×5,000원의 상금을 받게 된다.
//같은 눈이 3개만 나오면 10,000원+(3개가 나온 눈)×1,000원의 상금을 받게 된다.
//같은 눈이 2개씩 두 쌍이 나오는 경우에는 2,000원+(2개가 나온 눈)×500원+(또 다른 2개가 나온 눈)×500원의 상금을 받게 된다.
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());

        int max = 0;
        for (int i = 0; i < people; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            max = Math.max(max, getPrice(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())));
        }

        System.out.println(max);
    }

    private static int getPrice(int first, int second, int third, int fourth) {

        int price = 0;
        if (first == second && second == third && third == fourth) {
            price = 50000 + first * 5000;
        } else if ((first == second && second == third)
                || (first == second && second == fourth)
                || (first == third && third == fourth)
        ) {
            price = 10000 + first * 1000;
        } else if (second == third && third == fourth) {
            price = 10000 + second * 1000;
        } else if ((first == second && third == fourth)
                || (first == fourth && second == third)) {
            price = 2000 + first * 500 + third * 500;
        } else if (first == third && second == fourth) {
            price = 2000 + first * 500 + second * 500;
        } else if ((first == second)
                || (first == third)
                || (first == fourth)) {
            price = 1000 + first * 100;
        } else if ((second == third)
                || (second == fourth)) {
            price = 1000 + second * 100;
        } else if (third == fourth) {
            price = 1000 + third * 100;
        } else {
            price = Math.max(Math.max(first, second), Math.max(third, fourth)) * 100;
        }
        return price;
    }
}