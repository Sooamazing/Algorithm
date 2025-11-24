package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-24 10min
// https://www.acmicpc.net/problem/5613
public class CalcularProgram {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        char prevSymbol = '0';
        while (true) {
            int number = Integer.parseInt(br.readLine());
            char symbol = br.readLine().charAt(0);

            switch (prevSymbol) {
                case '+':
                    sum = sum + number;
                    break;
                case '-':
                    sum = sum - number;
                    break;
                case '*':
                    sum = sum * number;
                    break;
                case '/':
                    sum = sum / number;
                    break;
                default:
                    sum = number;
            }
            if (symbol == '=') {
                break;
            }

            prevSymbol = symbol;
        }

        System.out.println(sum);
    }
}