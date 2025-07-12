package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 25-07-12 30min
// https://www.acmicpc.net/problem/6378
public class DigitalRoot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String numberString;
        while (!(numberString = br.readLine()).equals("0")) {
            BigInteger sum = new BigInteger(numberString);

            BigInteger temp = getSum(sum);

            while (temp.divide(BigInteger.TEN).compareTo(BigInteger.ZERO) != 0) {
                temp = getSum(temp);
            }
            sb.append(temp).append("\n");
        }

        System.out.println(sb);
    }

    private static BigInteger getSum(BigInteger number) {

        BigInteger tempSum = BigInteger.ZERO;
        while (number.divide(BigInteger.TEN).compareTo(BigInteger.ZERO) > 0) {
            tempSum = tempSum.add(number.divide(BigInteger.TEN));
            number = number.mod(BigInteger.TEN);
        }
        tempSum = tempSum.add(number.mod(BigInteger.TEN));
        return tempSum;
    }
}
