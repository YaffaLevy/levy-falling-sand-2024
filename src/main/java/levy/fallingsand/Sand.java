package levy.fallingsand;

import java.util.Random;

public class Sand {

    private final int[][] field;
    private int width;
    private int height;
    private final Random random;

    public Sand(int width, int height) {
        this.width = width;
        this.height = height;
        field = new int[height][width];
        this.random = new Random();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
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
        // moves all sand down one square
        for (int y = field.length - 2; y >= 0; y--) {
            for (int x = 0; x < field[y].length; x++) {
                if (field[y][x] == 1) {
                    if (field[y + 1][x] == 0) {
                        // does the sand fall straight down?
                        field[y][x] = 0;
                        field[y + 1][x] = 1;
                        continue;
                    }
                    boolean rightFirst = random.nextBoolean();
                    int direction1 = rightFirst ? +1 : -1;
                    int direction2 = rightFirst ? -1 : +1;

                    // left edge
                    if (x == 0) {
                        if (field[y + 1][x] == 0) {
                            field[y][x] = 0;
                            field[y + 1][x] = 1;
                        }
                    }
                    // Right edge
                    else if (x == field[y].length - 1) {
                        if (field[y + 1][x] == 0) {
                            field[y][x] = 0;
                            field[y + 1][x] = 1;
                        }
                    } else {
                        if (field[y + 1][x] == 0) {
                            field[y][x] = 0;
                            field[y + 1][x] = 1;
                        } else if (field[y + 1][x + direction1] == 0) {
                            field[y][x] = 0;
                            field[y + 1][x + direction1] = 1;
                        } else if (field[y + 1][x + direction2] == 0) {
                            field[y][x] = 0;
                            field[y + 1][x + direction2] = 1;
                        }
                    }
                }
            }
        }
    }

    public void randomSand(int n) {
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(field[0].length);
            int y = random.nextInt(field.length);
            field[y][x] = 1;
        }
    }
}
