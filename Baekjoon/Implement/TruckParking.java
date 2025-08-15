package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-08-15 35min
// https://www.acmicpc.net/problem/2979
public class TruckParking {

    private static int START = 0;

    private static int END = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());

//        int[] startTime = new int[3];
//        int[] endTime = new int[3];
        int[][] car = new int[3 * 2][2];
        int receipt = 0;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            car[i] = new int[]{Integer.parseInt(st.nextToken()), START}; // start time
            car[i + 3] = new int[]{Integer.parseInt(st.nextToken()), END}; // end time
        }
        Arrays.sort(car, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0]; // Sort by time
        }); // Sort by time

        int currentCar = 1;
        for (int i = 1; i < car.length; i++) {

            if (currentCar == 1) {
                receipt += one * currentCar * (car[i][0] - car[i - 1][0]);
            } else if (currentCar == 2) {
                receipt += two * currentCar * (car[i][0] - car[i - 1][0]);
            } else if (currentCar >= 3) {
                receipt += three * currentCar * (car[i][0] - car[i - 1][0]);
            }

            if (car[i][1] == START) {
                currentCar++;
            } else { // END
                currentCar--;
            }
        }

        System.out.println(receipt);
    }

}