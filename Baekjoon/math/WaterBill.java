package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-06 10min
// https://www.acmicpc.net/problem/10707
public class WaterBill {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int xWagePerL = Integer.parseInt(br.readLine());
        int yBaseWage = Integer.parseInt(br.readLine());
        int yBaseMaxUsage = Integer.parseInt(br.readLine());
        int yExtraWagePerL = Integer.parseInt(br.readLine());
        int monthUsage = Integer.parseInt(br.readLine());

        int xWage = xWagePerL * monthUsage;
        int yWage = yBaseWage;
        if (monthUsage > yBaseMaxUsage) {
            yWage += yExtraWagePerL * (monthUsage - yBaseMaxUsage);
        }

        System.out.println(Math.min(xWage, yWage));
    }
}