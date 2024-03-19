package levy.fallingsand;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        initializeGUI();

        Scanner scanner = new Scanner(System.in);
        Sand sand = new Sand(50, 10);
        sand.randomSand(50);

        while (true) {
            System.out.println(sand);
            System.out.println("Press Enter to make sand fall");
            scanner.nextLine();
            sand.fall();
        }
    }

    public static void initializeGUI() {
        SandFrame frame = new SandFrame();
        frame.setVisible(true);
    }
}




