import java.util.*;
import java.lang.*;
import java.io.*;

// 25-08-10 15min
// https://www.acmicpc.net/problem/1773
public class FirecrackerShow
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firecracker = Integer.parseInt(st.nextToken());
        int maxTime = Integer.parseInt(st.nextToken());
        
        boolean[] timeArr = new boolean[maxTime+1];
        int result = 0;
        for(int i= 0 ; i<firecracker;i++){
            int duration = Integer.parseInt(br.readLine());
            
            for(int j = duration;j<=maxTime;j+=duration){
                if(timeArr[j]){
                    continue;
                }
                timeArr[j]=true;
                result++;
            }
        }
        
        System.out.println(result);
        
        
        
        // 메모리 초과
        // Set<Integer> timeSet = new HashSet<>();
        
        // for(int i= 0 ; i<firecracker;i++){
        //     int duration = Integer.parseInt(br.readLine());
            
        //     for(int j = duration;j<=maxTime;j+=duration){
        //         timeSet.add(j);
        //     }
            
        // }
        
        // System.out.println(timeSet.size());
    }
}
