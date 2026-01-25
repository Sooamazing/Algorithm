package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-25 10min
// https://www.acmicpc.net/problem/13304
public class RoomAllocation {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int student = Integer.parseInt(st.nextToken());
        int maxInRoom = Integer.parseInt(st.nextToken());

        int minRoom = 0;
        int[][] rooms = new int[6][2];
        for (int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int schoolYear = Integer.parseInt(st.nextToken());

            if (schoolYear == 1 || schoolYear == 2) {
                // 1~2학년은 남학생, 여학생 구별 없이 방을 배정할 수 있으며
                //  1~2학년은 학년 구별 없이 같은 방에 배정할 수 있으며
                rooms[1][0]++;
                if (rooms[1][0] == maxInRoom) {
                    minRoom++;
                    rooms[1][0] = 0;
                }
            } else if (schoolYear == 3 || schoolYear == 4) {
                // 남학생은 남학생끼리, 여학생은 여학생끼리
                // 학년 구별 없이 방을 배정
                rooms[3][sex]++;
                if (rooms[3][sex] == maxInRoom) {
                    minRoom++;
                    rooms[3][sex] = 0;
                }
            } else {
                // 남학생은 남학생끼리, 여학생은 여학생끼리
                // 학년 구별 없이 방을 배정
                rooms[5][sex]++;
                if (rooms[5][sex] == maxInRoom) {
                    minRoom++;
                    rooms[5][sex] = 0;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                if (rooms[i][j] > 0) {
                    minRoom++;
                }
            }
        }

        System.out.println(minRoom);
    }
}