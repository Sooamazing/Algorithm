package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-12 35
// https://www.acmicpc.net/problem/6378
public class DigitalRoot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String numberString;
        while (!(numberString = br.readLine()).equals("0")) {
            int sum = Integer.parseInt(numberString);

            int temp = getSum(sum);
            while (temp / 10 != 0) {
                temp = getSum(temp);
            }
            sb.append(temp).append("\n");
        }

        System.out.println(sb);
    }

    private static int getSum(int number) {

        int tempSum = 0;
        while (number / 10 > 0) {
            tempSum += number / 10;
            number %= 10;
        }
        tempSum += number % 10;
        return tempSum;
    }
}
