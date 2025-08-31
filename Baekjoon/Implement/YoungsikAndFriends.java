package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-31 10min
// https://www.acmicpc.net/problem/1592
public class YoungsikAndFriends {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int turn = Integer.parseInt(st.nextToken());
        int[] turnCount = new int[total];

        int sum = 0;
        int currentPerson = 0;
        while (true) {
            turnCount[currentPerson]++;
            if (turnCount[currentPerson] == max) {
                break;
            }
            sum++;
            if (turnCount[currentPerson] % 2 == 1) {
                currentPerson = (currentPerson + turn) % total;
            } else {
                currentPerson = ((currentPerson - turn < 0 ? currentPerson - turn + total
                        : currentPerson - turn));
            }
        }

        System.out.println(sum);
    }
}