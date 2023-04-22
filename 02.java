import java.util.*;

public class Level1 {
    public static int odometer(int[] oksana) {
        int distance = oksana[0] * oksana[1];
        for (int i = 1; i < oksana.length; i++) {
            if (i % 2 == 0) {
                distance = distance + oksana[i] * (oksana[i+1] - oksana[i-1]);
            }
        }
        return distance;
    }
}
