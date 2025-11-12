package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-12 15min
// https://www.acmicpc.net/problem/9517
public class ILoveCroatia {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine()) - 1;
        int question = Integer.parseInt(br.readLine());
        final int PEOPLE = 8;
        int leftMinutes = 3 * 60 + 30;

        for (int i = 0; i < question; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answerTime = Integer.parseInt(st.nextToken());
            char answerResult = st.nextToken().charAt(0);

            leftMinutes -= answerTime;

            if (leftMinutes <= 0) {
                System.out.println(index + 1);
                return;
            }
            if (answerResult == 'T') {
                index = (index + 1) % PEOPLE;
            }
        }
    }
}