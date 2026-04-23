package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-23 10min
// https://www.acmicpc.net/problem/6763
public class SpeedFinesAreNotFine {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        int diff = limit - speed;
        int fine = 0;
        if (diff >= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
            return;
        } else if (diff >= -20) {
            fine = 100;
        } else if (diff >= -30) {
            fine = 270;
        } else {
            fine = 500;
        }
        System.out.printf("You are speeding and your fine is $%d.", fine);
    }
}