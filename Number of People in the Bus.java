import java.util.ArrayList;

class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        int totalPassengers = 0;

        for (int[] stop : stops) {
            int entering = stop[0];
            int exiting = stop[1];
            totalPassengers += entering - exiting;
        }

        return totalPassengers;
    }
}
