package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 25-11-10 35min
// https://www.acmicpc.net/problem/15787
public class TrainRunsThroughDarknessThroughTheMilkyWay {

    private static final int MAX_SEAT = 20;

    private static boolean[][] trains;

    private static int[] trainIndexes;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int train = Integer.parseInt(st.nextToken());
        int totalCommand = Integer.parseInt(st.nextToken());

        trains = new boolean[train][20];
        trainIndexes = new int[train];
        // 20개의 일렬로 된 좌석
        while (totalCommand-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int roomNumber = Integer.parseInt(st.nextToken()) - 1;
            int seatNumber =
                    (command == 1 || command == 2) ? Integer.parseInt(st.nextToken()) - 1 : -1;

            processCommand(command, roomNumber, seatNumber);
        }

        Set<String> uniqueTrains = new HashSet<>();
        for (int room = 0; room < train; room++) {
            int trainIndex = trainIndexes[room];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 20; j++) {
                if (trains[room][(trainIndex + j) % MAX_SEAT]) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            }
            uniqueTrains.add(sb.toString());
        }

        System.out.println(uniqueTrains.size());

    }

    private static void processCommand(int command, int roomNumber, int seatNumber) {

        switch (command) {
            case 1:
                // 1 i x : i번째 기차에(1 ≤ i ≤ N) x번째 좌석에(1 ≤ x ≤ 20) 사람을 태워라. 이미 사람이 타있다면 , 아무런 행동을 하지 않는다.
                int seatIndex = (trainIndexes[roomNumber] + seatNumber) % MAX_SEAT;
                trains[roomNumber][seatIndex] = true;
                break;
            case 2:
                //2 i x : i번째 기차에 x번째 좌석에 앉은 사람은 하차한다. 만약 아무도 그자리에 앉아있지 않았다면, 아무런 행동을 하지 않는다.
                seatIndex = (trainIndexes[roomNumber] + seatNumber) % MAX_SEAT;
                trains[roomNumber][seatIndex] = false;
                break;
            case 3:
                //3 i : i번째 기차에 앉아있는 승객들이 모두 한칸씩 뒤로간다. k번째 앉은 사람은 k+1번째로 이동하여 앉는다. 만약 20번째 자리에 사람이 앉아있었다면 그 사람은 이 명령 후에 하차한다.
                seatIndex = ((trainIndexes[roomNumber] - 1) < 0 ? MAX_SEAT - 1
                        : (trainIndexes[roomNumber] - 1));
                trainIndexes[roomNumber] = seatIndex;
                trains[roomNumber][seatIndex] = false;
                break;
            case 4:
                //4 i : i번째 기차에 앉아있는 승객들이 모두 한칸씩 앞으로간다. k번째 앉은 사람은 k-1 번째 자리로 이동하여 앉는다. 만약 1번째 자리에 사람이 앉아있었다면 그 사람은 이 명령 후에 하차한다.
                seatIndex = trainIndexes[roomNumber];
                trains[roomNumber][seatIndex] = false;
                seatIndex = (trainIndexes[roomNumber] + 1) % MAX_SEAT;
                trainIndexes[roomNumber] = seatIndex;
                break;
            default:
                break;
        }
    }
}