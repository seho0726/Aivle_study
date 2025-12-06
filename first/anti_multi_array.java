import java.util.*;
import java.io.*;

public class anti_multi_array {
    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static String birthday_present(int[] A) {
        int n = A.length;
        Map<Integer, Pair> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int result = A[i] * A[j];

                if (map.containsKey(result)) {
                    Pair prev = map.get(result);

                    // 서로 다른 네 인덱스인지 확인
                    if (prev.x != i && prev.x != j && prev.y != i && prev.y != j) {
                        return "YES";
                    }
                } else {
                    map.put(result, new Pair(i, j));
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(birthday_present(A));
    }
}
