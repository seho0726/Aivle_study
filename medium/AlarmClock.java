import java.util.*;
import java.io.*;


public class AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String timeInput = br.readLine();
        long N = Long.parseLong(br.readLine());

        StringTokenizer st = new StringTokenizer(timeInput," :");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        long addedMinutes = N * (N-1) / 2;
        long totalMinutes = (hour * 60) + minute + addedMinutes;
        int cal = (int)(totalMinutes % 1440);
        int resultH = cal / 60;
        int resultM = cal % 60;
        System.out.print(String.format("%02d:%02d", resultH, resultM));

        br.close();

    }
}
