package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-01 20min
// https://www.acmicpc.net/problem/1362
// 참고: https://www.acmicpc.net/board/view/162929
public class Pet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int senario = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 적정 체중(o)와 실제 체중(w)
            int idealWeight = Integer.parseInt(st.nextToken());
            int realWeight = Integer.parseInt(st.nextToken());

            if (idealWeight == 0 && realWeight == 0) {
                break;
            }
            sb.append(senario).append(" ");
            boolean isDead = false;
            while (true) {
                st = new StringTokenizer(br.readLine());
                char cmd = st.nextToken().charAt(0);
                int effect = Integer.parseInt(st.nextToken());
                if (cmd == '#') {
                    // 펫에게는 적정 체중이 있습니다. 펫의 실제 체중이 적정 체중의 1/2배를 초과하면서 적정 체중의 2배 미만이라면 펫은 행복합니다. 펫의 실제 체중이 0 이하일 경우 펫은 사망하게 되며, 그 외의 경우 펫은 슬픕니다.
                    if (isDead) {
                        sb.append("RIP");
                    } else if (realWeight > idealWeight * 0.5 && realWeight < idealWeight * 2) {
                        sb.append(":-)");
                    } else {
                        sb.append(":-(");
                    }
                    senario++;
                    break;
                }
                if (isDead) {
                    continue;
                }
                if (cmd == 'F') {
                    //'F'와 숫자를 입력해 펫에게 먹이를 줄 수 있습니다. 입력된 숫자(n)만큼 펫에게 먹이를 주면 펫의 실제 체중이 n 증가합니다.
                    realWeight += effect;
                } else {
                    //'E'와 숫자를 입력해 펫을 운동시킬 수 있습니다. 입력된 숫자(n)만큼의 시간(분; minute)이 지나면 펫의 실제 체중이 n 감소합니다.
                    realWeight -= effect;
                    if (realWeight <= 0) {
                        // 펫이 중간에 죽는다면 이후의 작용은 무시됩니다.
                        isDead = true;
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}