package levy.fallingsand;

public class Main {
    public static void main(String[] args) {
        Sand sand = new Sand();

        sand.put(1, 0); // Place sand at (1, 0)
        sand.put(1, 1); // Place sand at (1, 1)

        System.out.println("Before Falling");
        System.out.println(sand);

        sand.fall();

        System.out.println("After Falling");
        System.out.println(sand);
    }
}

