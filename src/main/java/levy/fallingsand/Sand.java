package levy.fallingsand;

public class Sand {

    private int[][] field = new int[3][3];

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
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
        for (int y = field.length - 1; y >= 0; y--) {
            for (int x = 0; x < field[y].length; x++) {
                if (field[y][x] == 1 && y < 2 && field[y + 1][x] == 0) {
                    field[y + 1][x] = 1;
                    field[y][x] = 0;
                }
            }
        }
    }

}




