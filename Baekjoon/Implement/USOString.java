ckage
  
imimpimpoimporimpo
import java.io.IOException;
import java.io.InputStreamReader;


// 25-12-13
// https://velog.io/@eunah/%EB%B0%B1%EC%A4%80JAVA-32929%EB%B2%88-UOS-%EB%AC%B8%EC%9E%90%EC%97%B4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        if (num % 3 == 1){
            answer = "U";
        }else if (num % 3 == 2){
            answer = "O";
        }else{
            answer = "S";
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
