package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-22 35min
// https://www.acmicpc.net/problem/1969
public class DNA {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        String[] dnas = new String[total];
        for (int i = 0; i < total; i++) {
            dnas[i] = br.readLine();
        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            int tNumber = 0;
            int aNumber = 0;
            int gNumber = 0;
            int cNumber = 0;
            for (int j = 0; j < total; j++) {
                switch (dnas[j].charAt(i)) {
                    case 'A':
                        aNumber++;
                        break;
                    case 'G':
                        gNumber++;
                        break;
                    case 'C':
                        cNumber++;
                        break;
                    case 'T':
                        tNumber++;
                        break;
                    default:
                        break;
                }
            }

            // A, C, G, T 중 많은 것을 찾기.
            char answer;
            if (aNumber >= cNumber && aNumber >= gNumber && aNumber >= tNumber) {
                answer = 'A';
                count += (cNumber + gNumber + tNumber);
            } else if (cNumber >= aNumber && cNumber >= gNumber && cNumber >= tNumber) {
                answer = 'C';
                count += (aNumber + gNumber + tNumber);
            } else if (gNumber >= aNumber && gNumber >= cNumber && gNumber >= tNumber) {
                answer = 'G';
                count += (aNumber + cNumber + tNumber);
            } else {
                answer = 'T';
                count += (aNumber + cNumber + gNumber);
            }
            sb.append(answer);
        }

        sb.append("\n").append(count);

        System.out.println(sb);

    }
}