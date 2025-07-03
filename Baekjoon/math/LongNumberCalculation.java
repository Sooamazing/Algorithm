package Baekjoon.math;

import java.math.BigInteger;
import java.util.Scanner;

// 25-07-03 3min
// https://www.acmicpc.net/problem/2338
// 참고: https://tooo1.tistory.com/5
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger first = in.nextBigInteger();
        BigInteger second = in.nextBigInteger();

        System.out.println(first.add(second));
        System.out.println(first.subtract(second));
        System.out.print(first.multiply(second));

    }
}
