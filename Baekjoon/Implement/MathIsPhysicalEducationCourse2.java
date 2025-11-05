package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-05 5min
// https://www.acmicpc.net/problem/17362
public class MathIsPhysicalEducationCourse2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        int mod8 = number % 8;

        int finger = 0;
        switch (mod8) {
            case 1:
                finger = 1;
                break;
            case 0:
            case 2:
                finger = 2;
                break;
            case 3:
            case 7:
                finger = 3;
                break;
            case 4:
            case 6:
                finger = 4;
                break;
            case 5:
                finger = 5;
                break;
            default:
                break;
        }
        System.out.println(finger);
    }
}