package levy.fallingsand;

import java.util.Random;

public class Sand {

    private final int[][] field;

    private final Random random;

    public Sand(int width, int height) {
        field = new int[height][width];
        this.random = new Random();
    }

    public Sand(int width, int height, Random random) {
        field = new int[height][width];
        this.random = new Random();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                builder.append(field[y][x]);
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public int get(int x, int y) {
        return field[y][x];
    }

    public void put(int x, int y) {
        field[y][x] = 1;
    }

    public void fall() {
            for (int y = field.length - 2; y >= 0; y--) {
                for (int x = 0; x < field[y].length; x++) {
                    if (field[y][x] == 1 && y < field.length - 1) {
                        int direction = random.nextInt(3) - 1; // -1, 0, or 1
                        if (field[y + 1][x + direction] == 0) {
                            field[y + 1][x + direction] = 1;
                            field[y][x] = 0;
                        }
                    }
                }
            }
    }
    /* for (int y = field.length - 2; y >= 0; y--) {
            for (int x = 0; x < field[y].length; x++) {

                // does the sand fall straight down
                if (field[y][x] == 1 && y < 2 && field[y + 1][x] == 0) {
                    field[y + 1][x] = 1;
                    field[y][x] = 0;
                }

                // does the sand fall to the right?
                if (field[y][x] == 1 && y < 2 && field[y + 1][x + 1] == 0) {
                    field[y + 1][x + 1] = 1;
                    field[y][x] = 0;
                }

                // does the sand fall to the left
                if (field[y][x] == 1 && y < 2 && field[y + 1][x - 1] == 0) {
                    field[y + 1][x - 1] = 1;
                    field[y][x] = 0;
                }
            }
        }

    }

     */

    public void randomSand(int n) {
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(field[0].length);
            int y = random.nextInt(field.length);
            field[y][x] = 1;
        }
    }
}




