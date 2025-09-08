package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-08 5min
// https://www.acmicpc.net/problem/28113
public class PublicTransportationOnTheInformationIsland {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int subwayStation = Integer.parseInt(st.nextToken());
        int bus = Integer.parseInt(st.nextToken());
        int subway = Integer.parseInt(st.nextToken());

        boolean isFasterThanSubway = subway >= subwayStation;
        if (bus == subway) {
            System.out.println("Anything");
        } else if (isFasterThanSubway && bus > subway) {
            System.out.println("Subway");
        } else {
            System.out.println("Bus");
        }
    }
}