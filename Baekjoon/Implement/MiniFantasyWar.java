package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-01 5min
// https://www.acmicpc.net/problem/12790
public class MiniFantasyWar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int hp = Integer.parseInt(st.nextToken());
            int mp = Integer.parseInt(st.nextToken());
            int attackPower = Integer.parseInt(st.nextToken());
            int defensePower = Integer.parseInt(st.nextToken());

            // 단, HP와 MP는 1보다 작은 경우 1로 간주하며, 공격력은 0보다 작은 경우 0으로 간주한다. 방어력은 음수 여부에 상관하지 않는다.
            hp = Math.max(Integer.parseInt(st.nextToken()) + hp, 1);
            mp = Math.max(Integer.parseInt(st.nextToken()) + mp, 1);
            attackPower = Math.max(Integer.parseInt(st.nextToken()) + attackPower, 0);
            defensePower += Integer.parseInt(st.nextToken());

            int totalWarriorPower = 1 * (hp) + 5 * (mp) + 2 * (attackPower) + 2 * (defensePower);
            sb.append(totalWarriorPower).append("\n");
        }

        System.out.println(sb);

    }

}
