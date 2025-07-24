package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 25-07-24 15min
// https://www.acmicpc.net/problem/5893
// 참고: https://www.acmicpc.net/board/view/78665
public class SeventeenTimes {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger number = new BigInteger(br.readLine(), 2);
        BigInteger multiplied = number.multiply(BigInteger.valueOf(17L));
        System.out.println(multiplied.toString(2));
    }
}