package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-14 20min
// https://www.acmicpc.net/problem/2991
public class FierceDog {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstFierce = Integer.parseInt(st.nextToken());
        int firstRest = Integer.parseInt(st.nextToken());
        int secondFierce = Integer.parseInt(st.nextToken());
        int secondRest = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int postman = Integer.parseInt(st.nextToken());
        int milkman = Integer.parseInt(st.nextToken());
        int newspaperman = Integer.parseInt(st.nextToken());

        int postmanDog = 0;
        int milkmanDog = 0;
        int newspapermanDog = 0;
        for (int i = 0; i < 1000; i++) {

            if ((firstFierce + firstRest) * i < postman
                    && postman <= (firstFierce + firstRest) * i + firstFierce) {
                postmanDog++;
            }

            if ((secondFierce + secondRest) * i < postman
                    && postman <= (secondFierce + secondRest) * i + secondFierce) {
                postmanDog++;
            }

            if ((firstFierce + firstRest) * i < milkman
                    && milkman <= (firstFierce + firstRest) * i + firstFierce) {
                milkmanDog++;
            }

            if ((secondFierce + secondRest) * i < milkman
                    && milkman <= (secondFierce + secondRest) * i + secondFierce) {
                milkmanDog++;
            }

            if ((firstFierce + firstRest) * i < newspaperman
                    && newspaperman <= (firstFierce + firstRest) * i + firstFierce) {
                newspapermanDog++;
            }

            if ((secondFierce + secondRest) * i < newspaperman
                    && newspaperman <= (secondFierce + secondRest) * i + secondFierce) {
                newspapermanDog++;
            }
        }

        sb.append(postmanDog).append('\n')
                .append(milkmanDog).append('\n')
                .append(newspapermanDog);

        System.out.println(sb);
    }
}